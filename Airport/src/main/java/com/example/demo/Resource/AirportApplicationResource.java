package com.example.demo.Resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Airport;
import com.example.demo.service.AirportService;


@RestController

public class AirportApplicationResource {
	@Autowired
	private AirportService airportService;

	@RequestMapping("/service")

	public List<Airport> getAirport() {
	return airportService.getAllAirports();

	}

	@RequestMapping(method=RequestMethod.POST, value="/service")

	public void addAirport(@RequestBody Airport airport ) {
	airportService.addAirport(airport);
	}



	@RequestMapping(method=RequestMethod.PUT, value="/service/{airportCode}")

	public void updateAirport(@RequestBody Airport airport, @PathVariable String airportCode) {
	airportService.updateAirport(airportCode, airport);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/service/{airportCode}")
	public void deleteAirport( @PathVariable String airportCode) {
	airportService.deleteAirport(airportCode);
	}


	
}

	


