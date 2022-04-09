package People.passenger;

public class Passenger extends People.Person {

    int numberOfBags;

    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;
    }
    public int getNumberOfBags() {
        return numberOfBags;
    }


}
