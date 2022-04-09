package People.crew;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane() {
        return "NYEAOW!!!!!";
    }
}
