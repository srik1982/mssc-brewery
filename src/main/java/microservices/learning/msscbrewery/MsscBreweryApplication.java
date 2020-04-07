package microservices.learning.msscbrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import microservices.learning.msscbrewery.web.model.BeerDto;

@SpringBootApplication
public class MsscBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);		
	}

}
