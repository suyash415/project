package com.tka.oct_18_Copy_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MianBus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n*@@ --Welcome To Star Traviling-- @@* ");

		List<Bus> busList = new ArrayList<Bus>();

		busList.add(new Bus(101, "Shivneri", "Pune", "Mumbai", 500, 40));
		busList.add(new Bus(102, "Volvo Express", "Pune", "Nashik", 400, 35));
		busList.add(new Bus(103, "Neeta Travels", "Mumbai", "Pune", 600, 30));
		busList.add(new Bus(104, "Purple Travels", "Pune", "Kolhapur", 450, 32));
		busList.add(new Bus(105, "Raj Travels", "Pune", "Nagpur", 800, 45));
		busList.add(new Bus(106, "Sai Travels", "Mumbai", "Nashik", 550, 28));
		busList.add(new Bus(107, "Greenline", "Pune", "Satara", 300, 25));
		busList.add(new Bus(108, "National Travels", "Pune", "Aurangabad", 650, 40));

		Passenger p1 = new Passenger(11, "Nayan", 909876544, 22);

		Map<Integer, Bus> bus = new HashMap<Integer, Bus>();
		for (Bus b : busList) {
			bus.put(b.getId(), b);
		}

		System.out.println("\n========Avaible Buses============");
		for (Bus b : busList) {
			System.out.println(b.getId() + " : " + b.getName() + " : " + b.getSource() + " to " + b.getDestination()
					+ " : Rs." + b.getPrice() + " : Seats " + b.getAvailableSeats());
		}

		System.out.println("\nEnter Bus Id:");
		int busId = sc.nextInt();

		Bus selectedBus = bus.get(busId);

		if (selectedBus != null) {
			System.out.println("\n Enter number of seats:");
			int seats = sc.nextInt();

			if (seats > 0 || seats >= selectedBus.getAvailableSeats()) {
				double totalAmount = selectedBus.getPrice() * seats;

				selectedBus.setAvaibleSeats(selectedBus.getAvailableSeats() - seats);

				BusBooking booking = new BusBooking();
				booking.setBookingId((int) (Math.random() * 1000) + 1);
				booking.setPassenger(p1);
				booking.setBus(selectedBus);
				booking.setNumberOfseats(seats);
				booking.setAmount(totalAmount);
				booking.setStatus("Comfirmed");
				System.out.println("\n===== BUS BOOKING BILL =====");

				System.out.println("Booking ID: " + booking.getBookingId());
				System.out.println("Passenger ID: " + p1.getpId());
				System.out.println("Passenger Name: " + p1.getpName());
				System.out.println("Mobile: " + p1.getMob());
				System.out.println("Age: " + p1.getAge());

				System.out.println("\nBus Name: " + selectedBus.getName());
				System.out.println("Source: " + selectedBus.getSource());
				System.out.println("Destination: " + selectedBus.getDestination());
				System.out.println("Ticket Price: Rs." + selectedBus.getPrice());
				System.out.println("Seats Booked: " + booking.getNumberOfseats());

				System.out.println("-------------------------");
				System.out.println("Total Amount: Rs." + booking.getAmount());
				System.out.println("Booking Status: " + booking.getStatus());
				System.out.println("Remaining Seats: " + selectedBus.getAvailableSeats());

			} else {
				System.out.println("Invalid seat count or insufficient seats.");
			}

		} else {
			System.out.println("Invalid Bus ID.");
		}

		sc.close();
	}
}
