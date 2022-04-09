package Itinery;

import Itinery.Manifest.Manifest;
import People.crew.CabinCrewMember;
import People.crew.FlightAttendantManifest;
import People.crew.Pilot;
import People.passenger.Passenger;
import Plane.Plane;

public class Flight {

    private Manifest flightAttendantManifest;
    private Manifest pilotManifest;
    private Manifest passengerManifest;

    private String flightNumber;
    private String destination;
    private String departingAirport;
    private String departureTime;
    private Plane plane;

    public Flight(Manifest pilotManifest, Manifest flightAttendantManifest, Manifest passengerManifest,
                  String flightNumber, String destination, String departingAirport, String departureTime,
                  Plane plane){
        this.pilotManifest = pilotManifest;
        this.flightAttendantManifest = flightAttendantManifest;
        this.passengerManifest = passengerManifest;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingAirport = departingAirport;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public Manifest getPilotManifest() {
        return pilotManifest;
    }

    public Manifest getFlightAttendantManifest(){
        return flightAttendantManifest;
    }

    public Manifest getPassengerManifest() {
        return passengerManifest;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfFreeSeats() {
        int numberOfPassengers;
        int numberOfSeats;

        numberOfSeats = plane.getNumberOfSeats();
        numberOfPassengers = passengerManifest.getTotal();
        return (numberOfSeats - numberOfPassengers);
    }

    public String bookSeat(Passenger passenger) {
        int availableSeats;
        String passengerName;
       availableSeats = getNumberOfFreeSeats();

       if (availableSeats > 0) {
           passengerManifest.addPersonToManifest(passenger);
           passengerName = passenger.getName();
           return "Seat booked for " + passengerName;
       } else {
           return "No seats available";
       }

    }


}
