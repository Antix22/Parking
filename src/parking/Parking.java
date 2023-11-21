package parking;

public class Parking  {

    private int numberOfSpots;

    public Parking(int numberOfSeats) {
        this.numberOfSpots = numberOfSeats;
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "numberOfSeats=" + numberOfSpots +
                '}';
    }
}
