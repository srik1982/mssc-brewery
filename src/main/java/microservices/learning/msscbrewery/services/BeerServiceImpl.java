package microservices.learning.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Component;

import microservices.learning.msscbrewery.web.model.BeerDto;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(beerId).beerName("corona").beerStyle("something").upc(123L).build();
	}

}
