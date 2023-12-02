package parking;

public class Parking  extends Vehicle{

    private int numberOfSpots;
    private double price;


    public Parking(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Parking(int numberOfSpots) {

        this.numberOfSpots = numberOfSpots;
    }

    public Parking(int numberOfSpots, double price) {
        if (numberOfSpots < 0 || price < 0) {
            System.out.println("Liczba miejsc i cena nie mogą być ujemne");
        }
        this.numberOfSpots = numberOfSpots;
        this.price = price;
    }



    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    public double countPrice(){
        return numberOfSpots * (price *(23/100) + price);
    }

    public void displayPrice(){
        System.out.println("Do zapłaty masz " + price);
    }

    public void displaySeats(){
        System.out.println("Liczba miejsc zajętych na parkingu: "+ numberOfSpots);
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

