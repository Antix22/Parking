package parking;

public class Parking  {

    private int numberOfSpots;
    private double price;



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


    public void displayPrice(){
        System.out.println("Do zapłaty masz " + price);
    }

    public void displaySeats(){
        System.out.println("Liczba miejsc zajętych na parkingu: "+ numberOfSpots);
    }


    public void display() {
        {
            System.out.println("Parking posiada jeszcze " +
                    numberOfSpots
            );
        }


    }




}

