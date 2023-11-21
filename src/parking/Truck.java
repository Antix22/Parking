package parking;

public class Truck extends Vehicle{
 boolean isTrailer;

    public Truck(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Truck(String brand, String registration, String model, boolean isTrailer) {
        super(brand, registration, model);
        this.isTrailer = isTrailer;
    }

    @Override
    public void display() {
        System.out.println( "Truck{" +
                ", brand='" + super.getBrand() + '\'' +
                ", registration='" + super.getRegistration() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", przyczepa= " + isTrailer + '\'' +
                '}');
    }
}
