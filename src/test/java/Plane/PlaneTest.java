package Plane;

import Plane.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 300, 5000);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasNumberOfSeats() {
        assertEquals(300, plane.getNumberOfSeats());
    }

    @Test public void planeHasCargoWeightLimit() {
        assertEquals(5000, plane.getCargoWeightLimit());
    }

}
