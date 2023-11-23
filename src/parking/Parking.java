package parking;

public class Parking  extends Vehicle{

    private int numberOfSpots;



    public Parking(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Parking(int numberOfSpots) {

        this.numberOfSpots = numberOfSpots;
    }


    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public void display() {
        {
            System.out.println("Parking posiada jeszcze " +
                      numberOfSpots
                    );
    }
}
}
