package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Airport;

@Service
public class AirportService {
	
	private List<Airport> airports = new ArrayList<>(Arrays.asList(
			new Airport("123","Mumbai","IndiraGandhi Airport"),
			new Airport("1234","pune","Pune Airport")
			));

			public List<Airport> getAllAirports(){
			return airports;

			}



			public void addAirport(Airport airport) {
			airports.add(airport);

			}



			public void updateAirport(String airportCode, Airport airport) {
			for(int i=0; i< airports.size();i++) {
			Airport a = airports.get(i);
			if(a.getAirportCode().equals(airportCode)) {
			airports.set(i, airport);
			return;
			}

			}
			}
			public void deleteAirport(String airportCode) {
				airports.removeIf(a -> a.getAirportCode().equals(airportCode));
				}
}
