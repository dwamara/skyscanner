package com.dwitech.eap.skyscanner.adaptor.boundary;

import com.dwitech.eap.skyscanner.api.entity.request.BrowseDatesRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseGridRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseQuotesRequest;
import com.dwitech.eap.skyscanner.api.entity.request.BrowseRoutesRequest;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseDatesResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseGridResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseQuotesResponse;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseRoutesResponse;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

@Stateless
@Path("browses")
@Produces({APPLICATION_JSON, APPLICATION_XML})
@Consumes({APPLICATION_JSON, APPLICATION_XML})
public class BrowsesResource {
    @Inject Browses browses;

    @POST
    @Path("dates")
    public Response browseDates(BrowseDatesRequest request){
        BrowseDatesResponse response = browses.browseDates(request);
        return Response.ok(response).build();
    }

    @POST
    @Path("grid")
    public Response browseGrid(BrowseGridRequest request){
        BrowseGridResponse response = browses.browseGrid(request);
        return Response.ok(response).build();
    }

    @POST
    @Path("quotes")
    public Response browseQuotes(BrowseQuotesRequest request){
        BrowseQuotesResponse response = browses.browseQuotes(request);
        return Response.ok(response).build();
    }

    @POST
    @Path("routes")
    public Response browseRoutes(BrowseRoutesRequest request){
        BrowseRoutesResponse response = browses.browseRoutes(request);
        return Response.ok(response).build();
    }

}
