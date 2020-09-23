package com.cg.iter.flight.service;

import java.util.List;

import com.cg.iter.flight.dto.FlightDTO;

public interface FlightService {
List<FlightDTO> viewAllFlights();
boolean addFlight (FlightDTO flight);
boolean modifyFlight (FlightDTO flight);
boolean removeFlight (int flightNumber);
}
