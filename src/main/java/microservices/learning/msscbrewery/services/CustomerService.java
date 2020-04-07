package microservices.learning.msscbrewery.services;

import java.util.UUID;

import microservices.learning.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomer(UUID id);
}
