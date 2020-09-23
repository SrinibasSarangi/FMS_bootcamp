package com.cg.iter.flight.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.iter.flight.dto.FlightDTO;

public interface FlightRepository extends CrudRepository<FlightDTO,Integer> {

}
