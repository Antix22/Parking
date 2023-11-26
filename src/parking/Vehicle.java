package parking;

public class Vehicle {
    private String brand;
    private String registration;
    private String model;


    public Vehicle(String brand, String registration, String model) {
        this.brand = brand;
        this.registration = registration;
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

