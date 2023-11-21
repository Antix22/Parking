package parking;

public class MotorBike extends Vehicle {
    int pojemnosc;

    public MotorBike(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public MotorBike(String brand, String registration, String model, int pojemnosc) {
        super(brand, registration, model);
        this.pojemnosc = pojemnosc;
    }

    @Override
    public void display() {
        System.out.println( "MotorBike{" +
                " brand='" + super.getBrand() + '\'' +
                ", registration='" + super.getRegistration() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", pojemność= " + pojemnosc + '\'' +
                '}');
    }
}
