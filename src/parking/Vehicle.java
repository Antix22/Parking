package parking;

import java.util.Locale;
import java.util.Scanner;

public class Vehicle {
    private String brand;
    private String registration;
    private String model;

    Scanner scanner = new Scanner(System.in);

    public Vehicle(String brand, String registration, String model) {

            while (!brand.matches("[A-Za-z]+")){
                System.out.println("Nie poprawne dane, Wprowadź poprawne dane");
                System.out.println("podaj markę");
                brand = scanner.next();

            }
        while ( registration.length() < 4 ||
                !registration.substring(0, 2).matches("[A-Za-z]+") ||
                !registration.substring(2).matches("\\d+")){
            System.out.println("Nie poprawne dane, Wprowadź poprawne dane");

            System.out.println("podaj rejestracje");
            registration = scanner.next();
        }



        this.brand = brand;
        this.registration = registration.toUpperCase();
        this.model = model;

    }

    public Vehicle(Vehicle usun) {
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistration() {
        return registration;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println( "Car{" +
                ", brand='" + brand + '\'' +
                ", registration='" + registration + '\'' +
                ", model='" + model + '\'' +
                '}');
    }




}

