import parking.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        String choise;
        double price = 0;
        double endPrice= 0;
        boolean isFind = false;
        do {
            System.out.println("1 - Motor, Cena to 5zł/godzina");
            System.out.println("2 - Samochód, Cena to 10zł/godzina");
            System.out.println("3 - Ciężarówka Cena to 15zł/godzina");
            System.out.println("4 - Usuń pojazd");
            int rodzajPojazdu = scanner.nextInt();


            switch (rodzajPojazdu) {
                case 1:


                    do {
                        System.out.println("podaj marke");
                        String brand = scanner.next();
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

                        System.out.println("ile godzin bedzie na parkingu?");
                        int hours = scanner.nextInt();
                        price = 5;
                        endPrice += hours * price;


                        if (isFind)
                            System.out.println("czy wprowadzić kolejny motocykl");
                        choise = scanner.next();

                    }
                    while (choise.equalsIgnoreCase("Tak"));

                    break;
                case 2:
                    do {
                        System.out.println("podaj marke");
                        String brand = scanner.next();
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

                        System.out.println("ile godzin bedzie na parkingu?");
                        int hours = scanner.nextInt();
                        price = 10;
                        endPrice += hours * price;;

                        if (isFind)
                            System.out.println("czy wprowadzić kolejny samochód");
                        choise = scanner.next();
                    }
                    while (choise.equalsIgnoreCase("Tak"));
                    break;

                case 3:
                    do {
                        System.out.println("podaj marke");
                        String brand = scanner.next();
                        scanner.nextLine();

                        System.out.println("podaj rejestracje");
                        String rejestracja = scanner.nextLine();

                        System.out.println("podaj model");
                        String model = scanner.nextLine();

                        System.out.println("czy ma przyczepe");
                        String przyczepa = scanner.next();

                        scanner.nextLine();
                        Truck truck = new Truck(brand, rejestracja, model, przyczepa);
                        vehicles.add(truck);
                        isFind = true;
                        System.out.println("ile godzin bedzie na parkingu?");
                        int hours = scanner.nextInt();
                        price = 15;
                        endPrice += hours * price;

                        if (isFind)
                            System.out.println("czy wprowadzić kolejną ciężarówkę");
                        choise = scanner.next();


                    }
                    while (choise.equalsIgnoreCase("Tak"));
                    break;






            }
            System.out.println("czy chcesz dodać inny pojazd lub go usunąć");
            choise = scanner.next();
        } while (choise.equalsIgnoreCase("Tak"));


        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }

        Parking parking = new Parking(1000, endPrice);


        List<Parking> parkings = new ArrayList<>();
        parkings.add(parking);
        for (Parking parking1 : parkings) {
            parking1.display();
            parking1.setNumberOfSpots(parking1.getNumberOfSpots() - vehicles.size());
            parking1.display();
            parking1.setNumberOfSpots(parking.getNumberOfSpots() - (parking1.getNumberOfSpots() - vehicles.size()));
            parking1.display();
            parking1.displayPrice();
        }

    }
}