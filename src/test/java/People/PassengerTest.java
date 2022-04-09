package People;

import People.passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Will Smith", 3);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Will Smith", passenger.getName());
    }

    @Test
    public void passengerHasANumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }

}
