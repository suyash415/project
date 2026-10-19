package com.tka.oct_18_Copy_2;

public class BusBooking {
	private int bookingId;
	private Passenger passenger;
	private Bus bus;
	private int numberOfseats;
	private double amount;
	private String status;

	public BusBooking() {

	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getNumberOfseats() {
		return numberOfseats;
	}

	public void setNumberOfseats(int numberOfseats) {
		this.numberOfseats = numberOfseats;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
