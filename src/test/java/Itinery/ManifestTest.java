package Itinery;

import Itinery.Manifest.Manifest;
import People.crew.CabinCrewMember;
import People.crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManifestTest {
    Manifest flightAttendantManifest;
    CabinCrewMember sandra;
    CabinCrewMember james;

    @Before
    public void before(){
        flightAttendantManifest = new Manifest();
        sandra = new CabinCrewMember("Sandra", Rank.FlightAttendant);
        james = new CabinCrewMember("James", Rank.FlightAttendant);
        flightAttendantManifest.addPersonToManifest(sandra);
        flightAttendantManifest.addPersonToManifest(james);
    }

   @Test
    public void getCrewMemberFromManifestIndex() {
        assertEquals(sandra, flightAttendantManifest.getPersonFromManifestIndex(0));
   }

   @Test
    public void getTotalItemsOnManifest() {
        assertEquals(2, flightAttendantManifest.getTotal());
   }

}
