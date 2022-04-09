package People;

import People.crew.Pilot;
import People.crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before()  {
        pilot = new Pilot("Red Baron", Rank.Captain, "RB990");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Red Baron", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.Captain, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber() {
        assertEquals("RB990", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("NYEAOW!!!!!", pilot.flyPlane());
    }
}
