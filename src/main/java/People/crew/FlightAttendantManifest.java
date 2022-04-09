package People.crew;

import java.util.ArrayList;

public class FlightAttendantManifest {

    private ArrayList<CabinCrewMember> manifest;

    public FlightAttendantManifest() {
        this.manifest = new ArrayList<>();
    }

    public void addFlightAttendantToManifest(CabinCrewMember flightAttendant) {
        this.manifest.add(flightAttendant);
    }

    public CabinCrewMember getCrewMemberFromManifestIndex(int manifestIndex){
        return manifest.get(manifestIndex);
    }

}
