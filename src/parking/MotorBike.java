package parking;

import java.util.Scanner;

public class MotorBike extends Vehicle {
    int pojemnosc;
    Scanner scanner = new Scanner(System.in);
    public MotorBike(String brand, String registration, String model) {
        super(brand, registration, model);
    }

    public MotorBike(String brand, String registration, String model, int pojemnosc) {
        super(brand, registration, model);
        while (pojemnosc < 0) {
            System.out.println("Pojemność nie może być mniejsza niż zero. Wprowadź poprawną wartość:");
            pojemnosc = scanner.nextInt();
        }

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