package com.dwitech.eap.skyscanner.adaptor.control;

import com.dwitech.eap.skyscanner.adaptor.entity.InOutBoundLeg;
import com.dwitech.eap.skyscanner.adaptor.entity.SkyscannerCheapestQuotesResponse;
import com.dwitech.eap.skyscanner.adaptor.entity.SkyscannerQuote;
import com.dwitech.eap.skyscanner.api.entity.commons.Carrier;
import com.dwitech.eap.skyscanner.api.entity.commons.Leg;
import com.dwitech.eap.skyscanner.api.entity.commons.Place;
import com.dwitech.eap.skyscanner.api.entity.commons.Quote;
import com.dwitech.eap.skyscanner.api.entity.response.BrowseQuotesResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.time.LocalDateTime.parse;
import static java.util.stream.Collectors.toMap;

public class ObjectFactory {

	public SkyscannerCheapestQuotesResponse transform(final BrowseQuotesResponse response) {
		final SkyscannerCheapestQuotesResponse cheapestQuotesResponse = new SkyscannerCheapestQuotesResponse();
		final List<SkyscannerQuote> quotes = new ArrayList<>();

		response.getQuotes().forEach(q -> {
			final SkyscannerQuote quote = createQuote(response, q);
			quotes.add(quote);
		});

		cheapestQuotesResponse.setQuotes(quotes);
		return cheapestQuotesResponse;
	}

	private SkyscannerQuote createQuote(final BrowseQuotesResponse response, final Quote q) {
		final SkyscannerQuote quote = new SkyscannerQuote();
		quote.setDirect(q.getDirect());
		quote.setPrice(q.getMinPrice());

		quote.setInboundLeg(createInOutBoundLeg(response, q.getInboundLeg()));
		quote.setOutboundLeg(createInOutBoundLeg(response, q.getOutboundLeg()));
		return quote;
	}

	private InOutBoundLeg createInOutBoundLeg(final BrowseQuotesResponse response, final Leg inoutLeg) {
		final InOutBoundLeg leg = new InOutBoundLeg();

		leg.setDepartureDate(parse(inoutLeg.getDepartureDate()));

		final List<Integer> carrierIds = inoutLeg.getCarrierIds();
		if (carrierIds != null && !carrierIds.isEmpty()) {
			leg.setCarrier(carrierLookUp(response.getCarriers(), carrierIds.get(0)));
		}
		leg.setOrigin(placeLookUp(response.getPlaces(), inoutLeg.getOriginId()));
		leg.setDestination(placeLookUp(response.getPlaces(), inoutLeg.getDestinationId()));
		return leg;
	}

	private String placeLookUp(final List<Place> places, final int placeId) {
		final Map<Integer, String> placesMap =
				places.stream().collect(toMap(Place::getPlaceId, Place::getName));
		return placesMap.get(placeId);
	}

	private String carrierLookUp(final List<Carrier> carriers, final int carrierId) {
		final Map<Integer, String> carriersMap =
				carriers.stream().collect(toMap(Carrier::getCarrierId, Carrier::getName));
		return carriersMap.get(carrierId);
	}


}
