package Plane;

public class Plane {

    private PlaneType planeType;
    private int numberOfSeats;
    private int cargoWeightLimit;

    public Plane(PlaneType planeType, int numberOfSeats, int cargoWeightLimit){
        this.planeType = planeType;
        this.numberOfSeats = numberOfSeats;
        this.cargoWeightLimit = cargoWeightLimit;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCargoWeightLimit() {
        return cargoWeightLimit;
    }
}
