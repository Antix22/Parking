package parking;

public class Car extends Vehicle{
    String type;

    public Car(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Car(String brand, String registration, String model, String type) {
        super(brand, registration, model);
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println( "Car{" +
                ", brand='" + super.getBrand() + '\'' +
                ", registration='" + super.getRegistration() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", typ= " + type + '\'' +
                '}');
    }
}
