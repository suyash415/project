package com.tka.oct_18_Copy_2;

public class Bus {

	private int id;
	private String name;
	private String source;
	private String destination;
	private double price;
	private int availableSeats;

	public Bus() {

	}

	public Bus(int id, String name, String source, String destination, double price, int avaibleSeats) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.availableSeats = avaibleSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvaibleSeats(int avaibleSeats) {
		this.availableSeats = avaibleSeats;
	}

}
