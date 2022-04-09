package People;

import People.crew.CabinCrewMember;
import People.crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("John Doe", Rank.Captain);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("John Doe", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(Rank.Captain, cabinCrewMember.getRank());
    }

    @Test
    public void CabinCrewMemberCanRelayMessage() {
        assertEquals("Peanuts will be served in 10 minutes", cabinCrewMember.relayMessage("Peanuts will be served in 10 minutes"));
    }
}


