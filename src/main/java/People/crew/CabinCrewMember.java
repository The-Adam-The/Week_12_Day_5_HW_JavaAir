package People.crew;

public class CabinCrewMember extends People.Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }
    public Rank getRank() {
        return this.rank;
    }

    public String relayMessage(String message) {
        return message;
    }

}
