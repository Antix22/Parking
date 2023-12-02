package parking;

import java.util.Scanner;

public class Car extends Vehicle{
    String type;
    Scanner scanner = new Scanner(System.in);

    public Car(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public Car(String brand, String registration, String model, String type) {
        super(brand, registration, model);

        switch (type.toLowerCase()) {
            case "sedan":
            case "suv":
            case "kabriolet":
            case "coupe":
                this.type = type.toLowerCase();
                break;
            default:
                type.isEmpty();
        }
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