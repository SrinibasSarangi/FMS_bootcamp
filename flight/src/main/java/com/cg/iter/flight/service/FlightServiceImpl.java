package com.cg.iter.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.flight.dto.FlightDTO;
import com.cg.iter.flight.repository.FlightRepository;

public class FlightServiceImpl implements FlightService{
@Autowired
	FlightRepository flightRepository;
	
	@Override
	public List<FlightDTO> viewAllFlights() {
		// TODO Auto-generated method stub
		return (List<FlightDTO>) flightRepository.findAll();
	}

	@Override
	public boolean addFlight(FlightDTO flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyFlight(FlightDTO flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFlight(int flightNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
