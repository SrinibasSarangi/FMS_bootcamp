package com.cg.iter.flight.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_table")
public class FlightDTO {
	@Id
private int flightNumber;
private String carrierName;
private String flightModel;
private int seatCapacity;
public FlightDTO() {  }
public FlightDTO(int flightNumber, String carrierName, String flightModel, int seatCapacity) {
	super();
	this.flightNumber = flightNumber;
	this.carrierName = carrierName;
	this.flightModel = flightModel;
	this.seatCapacity = seatCapacity;
}
public int getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public String getCarrierName() {
	return carrierName;
}
public void setCarrierName(String carrierName) {
	this.carrierName = carrierName;
}
public String getFlightModel() {
	return flightModel;
}
public void setFlightModel(String flightModel) {
	this.flightModel = flightModel;
}
public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}



}
