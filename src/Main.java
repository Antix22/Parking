import parking.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        String choise;
        boolean isFind = false;
        do{
            System.out.println("1 - Motor");
            System.out.println("2 - Samochód");
            System.out.println("3 - Ciężarówka");
            int rodzajPojazdu = scanner.nextInt();

        switch (rodzajPojazdu){
            case 1:


                do{
                    System.out.println("podaj marke");
                String brand = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("podaj rejestracje");
                    String rejestracja = scanner.nextLine();

                    System.out.println("podaj model");
                    String model = scanner.nextLine();

                    System.out.println("podaj pojemnosc");
                    int pojemnosc = scanner.nextInt();
                    scanner.nextLine();
                MotorBike motorBike = new MotorBike(brand, rejestracja, model, pojemnosc);
                vehicles.add(motorBike);
                isFind = true;

                if(isFind)
                    System.out.println("czy wprowadzić kolejny motocykl");
                       choise = scanner.nextLine();
                }
                while(choise.equalsIgnoreCase("Tak"));

                break;
            case 2:
                do{
                    System.out.println("podaj marke");
                    String brand = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("podaj rejestracje");
                    String rejestracja = scanner.nextLine();

                    System.out.println("podaj model");
                    String model = scanner.nextLine();

                    System.out.println("podaj typ");
                    String type = scanner.nextLine();

                    Car car = new Car(brand, rejestracja, model, type);
                    vehicles.add(car);
                    isFind = true;

                    if(isFind)
                        System.out.println("czy wprowadzić kolejny motocykl");
                    choise = scanner.nextLine();
                }
                while(choise.equalsIgnoreCase("Tak"));
                break;

            case 3:
                do{
                    System.out.println("podaj marke");
                    String brand = scanner.next();
                    scanner.nextLine();

                    System.out.println("podaj rejestracje");
                    String rejestracja = scanner.nextLine();

                    System.out.println("podaj model");
                    String model = scanner.nextLine();

                    System.out.println("czy ma przyczepe");
                    boolean przyczepa = scanner.nextBoolean();

                    scanner.nextLine();
                    Truck truck = new Truck(brand, rejestracja, model, przyczepa);
                    vehicles.add(truck);
                    isFind = true;

                    if(isFind)
                        System.out.println("czy wprowadzić kolejną cie");
                    choise = scanner.nextLine();

                }
                while(choise.equalsIgnoreCase("Tak"));
                break;

        }
            System.out.println("czy chcesz dodać inny pojazd");
        choise = scanner.nextLine();
        }while(choise.equalsIgnoreCase("Tak"));


        for(Vehicle vehicle : vehicles){
            vehicle.display();
        }

        Parking parking = new Parking(1000);

        List<Parking> parkings = new ArrayList<>();
        parkings.add(parking);
        }

}