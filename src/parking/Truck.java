package parking;

public class Truck extends Vehicle{
    String isTrailer;

    public Truck(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Truck(String brand, String registration, String model, String isTrailer) {
        super(brand, registration, model);
        if(isTrailer.equalsIgnoreCase("tak"))
            this.isTrailer = isTrailer;
        else isTrailer.isEmpty();

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