package microservices.learning.msscbrewery.services;

import java.util.UUID;

import microservices.learning.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
