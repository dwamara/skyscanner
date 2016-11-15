package com.dwitech.eap.skyscanner.adaptor.boundary;

import com.dwitech.eap.skyscanner.adaptor.control.ArrayAdapterFactory;
import com.dwitech.eap.skyscanner.adaptor.control.IPAddressFinder;
import com.dwitech.eap.skyscanner.adaptor.control.RequestMethod;
import com.dwitech.eap.skyscanner.adaptor.control.Response;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseDatesRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseGridRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseQuotesRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseRoutesRequest;
import com.dwitech.eap.skyscanner.api.entity.request.CommonRequest;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseDatesResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseGridResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseQuotesResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseRoutesResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.deltaspike.core.api.config.ConfigProperty;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.IOException;

import static javax.ws.rs.core.UriBuilder.fromPath;

@Stateless
public class Browses {
    @Inject IPAddressFinder ipAddressFinder;

    @Inject @ConfigProperty(name = "browse.dates.url") private String browseDatesUrl;
    @Inject @ConfigProperty(name = "browse.grid.url") private String browseGridUrl;
    @Inject @ConfigProperty(name = "browse.quotes.url") private String browseQuotesUrl;
    @Inject @ConfigProperty(name = "browse.routes.url") private String browseRoutesUrl;

    @Inject
    ExternalServiceCaller externalServiceCaller;

    Gson gson;

    @PostConstruct
    void initializeRestClients() {
        gson = new GsonBuilder().registerTypeAdapterFactory(new ArrayAdapterFactory()).create();
    }

    public BrowseDatesResponse browseDates(BrowseDatesRequest request) {
        final String callURL = buildUrl("http://partners.api.skyscanner.net/apiservices/browsedates/v1.0/{market}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate}", request);
        BrowseDatesResponse browseDatesResponse;
        try {
            final Response response = externalServiceCaller.sendRequest(callURL, RequestMethod.GET);
            if (response.getStatusCode() == 200) {
                browseDatesResponse = gson.fromJson(response.getBody(), BrowseDatesResponse.class);
                return browseDatesResponse;
            } else {

            }
        } catch (IOException eValue) {
            eValue.printStackTrace();
        }
        return null;
    }

    public BrowseGridResponse browseGrid(BrowseGridRequest request) {
        final String callURL = buildUrl(browseGridUrl, request);
        BrowseGridResponse browseGridResponse;
        try {
            final Response response = externalServiceCaller.sendRequest(callURL, RequestMethod.GET);
            if (response.getStatusCode() == 200) {
                browseGridResponse = gson.fromJson(response.getBody(), BrowseGridResponse.class);
                return browseGridResponse;
            } else {

            }
        } catch (IOException eValue) {
            eValue.printStackTrace();
        }
        return null;
    }

    public BrowseQuotesResponse browseQuotes(BrowseQuotesRequest request) {
        final String callURL = buildUrl(browseQuotesUrl, request);
        BrowseQuotesResponse browseQuotesResponse;
        try {
            final Response response = externalServiceCaller.sendRequest(callURL, RequestMethod.GET);
            if (response.getStatusCode() == 200) {
                browseQuotesResponse = gson.fromJson(response.getBody(), BrowseQuotesResponse.class);
                return browseQuotesResponse;
            } else {

            }
        } catch (IOException eValue) {
            eValue.printStackTrace();
        }
        return null;
    }

    public BrowseRoutesResponse browseRoutes(BrowseRoutesRequest request) {
        BrowseRoutesResponse browseRoutesResponse;
        final String callURL = buildUrl(browseRoutesUrl, request);
        try {
            final Response response = externalServiceCaller.sendRequest(callURL, RequestMethod.GET);
            if (response.getStatusCode() == 200) {
                browseRoutesResponse = gson.fromJson(response.getBody(), BrowseRoutesResponse.class);
                return browseRoutesResponse;
            } else {

            }
        } catch (IOException eValue) {
            eValue.printStackTrace();
        }
        return null;
    }

    private String buildUrl(String browseURL, final CommonRequest request) {
        return fromPath(browseURL).build(request.getMarket(),
                request.getCurrency(),
                request.getLocale(),
                request.getOriginPlace(),
                request.getDestinationPlace(),
                request.getOutboundPartialDate().toString(),
                request.getInboundPartialDate().toString())
                .toString() + "?apiKey=" + request.getApiKey();
    }
}
