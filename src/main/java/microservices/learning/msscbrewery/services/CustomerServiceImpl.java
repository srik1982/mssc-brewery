package microservices.learning.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Component;

import microservices.learning.msscbrewery.web.model.CustomerDto;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomer(UUID id) {
		
		return CustomerDto.builder().id(id).name("customer101").description("A total drunkard").build();
	}

}
