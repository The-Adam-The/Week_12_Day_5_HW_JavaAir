package Itinery;

import Itinery.Manifest.Manifest;
import People.crew.CabinCrewMember;
import People.crew.Pilot;
import People.crew.Rank;
import People.passenger.Passenger;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot biggles;
    Pilot riker;

    CabinCrewMember sandra;
    CabinCrewMember james;
    CabinCrewMember elliot;
    CabinCrewMember cara;

    Passenger isla;
    Passenger darryl;
    Passenger isaac;
    Passenger henry;


    Manifest pilotManifest;
    Manifest flightAttendantManifest;
    Manifest passengerManifest;

    Plane plane;
    Plane planeTwo;


    Flight flight;
    Flight flightTwo;

    @Before
    public void before() {
        biggles = new Pilot("Biggles", Rank.Captain, "BI890");
        riker = new Pilot("Riker", Rank.FirstOfficer, "RI993");

        pilotManifest = new Manifest();

        pilotManifest.addPersonToManifest(biggles);
        pilotManifest.addPersonToManifest(riker);

        sandra = new CabinCrewMember("Sandra", Rank.FlightAttendant);
        james = new CabinCrewMember("James", Rank.FlightAttendant);
        elliot = new CabinCrewMember("Elliot", Rank.FlightAttendant);
        cara = new CabinCrewMember("Cara", Rank.FlightAttendant);

        flightAttendantManifest = new Manifest();
        flightAttendantManifest.addPersonToManifest(sandra);
        flightAttendantManifest.addPersonToManifest(james);

        isla = new Passenger("Isla Whittaker", 4);
        darryl = new Passenger("Darryl Ellis", 1);
        isaac = new Passenger("Isaac Asamov", 2);
        henry = new Passenger("Henry Kissinger", 5);

        passengerManifest = new Manifest();
        passengerManifest.addPersonToManifest(isaac);
        passengerManifest.addPersonToManifest(isla);
        passengerManifest.addPersonToManifest(henry);
        passengerManifest.addPersonToManifest(darryl);

        plane = new Plane(PlaneType.BOEING747, 300, 5000);
        planeTwo = new Plane(PlaneType.BOEING747, 0, 0);
        flight = new Flight(pilotManifest, flightAttendantManifest, passengerManifest, "FR788", "Paris", "Glasgow Prestwick", "17:00", plane);
        flightTwo = new Flight(pilotManifest, flightAttendantManifest, passengerManifest,
                "GER989", "Berlin", "Glasgow Prestwick", "18:00", planeTwo);
    }

    @Test
    public void flightHasPilotManifest() {
        assertEquals(pilotManifest, flight.getPilotManifest());
    }

    @Test
    public void flightHasFlightAttendantManifest() {
        assertEquals(flightAttendantManifest, flight.getFlightAttendantManifest());
    }

    @Test
    public void flightHasPassengerManifest() {
        assertEquals(passengerManifest, flight.getPassengerManifest());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("FR788", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("Paris", flight.getDestination());
    }

    @Test
    public void flightHasDepartingAirport() {
        assertEquals("Glasgow Prestwick", flight.getDepartingAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("17:00", flight.getDepartureTime());
    }

    @Test
    public void flightCanReturnNumberOfEmptySeats() {
        assertEquals(296, flight.getNumberOfFreeSeats());
    }

    @Test
    public void canBookFlightIfSeatsAreAvailable() {
        Passenger gary;
        gary = new Passenger("Gary MacGregor", 2);
        flight.bookSeat(gary);
        assertEquals(295, flight.getNumberOfFreeSeats());
    }

    @Test

    public void cantBookFlightIfSeatsAreUnavailable() {
        Passenger david;
        david = new Passenger("David Dave", 3);
        assertEquals("No seats available", flightTwo.bookSeat(david));


    }


}
