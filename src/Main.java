import parking.*;

import java.util.ArrayList;
import java.util.Iterator;
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



            System.out.println("1 - Dodaj pojazd (ręcznie)");
            System.out.println("2 - usun pojazd (ręcznie)");
            System.out.println("3 - dodaj pojazdy automatycznie");

            int dodajUsun = scanner.nextInt();

            switch(dodajUsun){
                case 1:
                    System.out.println("1 - Motor, Cena to 5zł/godzina");
                    System.out.println("2 - Samochód, Cena to 10zł/godzina");
                    System.out.println("3 - Ciężarówka Cena to 15zł/godzina");
                    int rodzajPojazdu = scanner.nextInt();
                    switch (rodzajPojazdu) {
                        case 1:


                            do {
                                System.out.println("podaj marke (bez cyfr)");
                                String brand = scanner.next();
                                scanner.nextLine();

                                System.out.println("podaj rejestracje (2 pierwsze znaki to litery, a kolejne znaki to cyfry, conajmniej 2)");
                                String rejestracja = scanner.nextLine();

                                System.out.println("podaj model");
                                String model = scanner.nextLine();

                                System.out.println("podaj pojemnosc (tylko cyfry)");
                                int pojemnosc = scanner.nextInt();
                                scanner.nextLine();
                                MotorBike motorBike = new MotorBike(brand, rejestracja, model, pojemnosc);
                                vehicles.add(motorBike);
                                isFind = true;




                                if (isFind)
                                    System.out.println("czy wprowadzić kolejny motocykl (jesli tak napisz `tak`)");
                                choise = scanner.next();


                            }
                            while (choise.equalsIgnoreCase("Tak"));

                            break;
                        case 2:
                            do {
                                System.out.println("podaj marke (bez cyfr)");
                                String brand = scanner.next();
                                scanner.nextLine();

                                System.out.println("podaj rejestracje (2 pierwsze znaki to litery, a kolejne znaki to cyfry, conajmniej 2)");
                                String rejestracja = scanner.nextLine();

                                System.out.println("podaj model");
                                String model = scanner.nextLine();

                                System.out.println("podaj typ (sedan, suv, kabriolet lub coupe)");
                                String type = scanner.nextLine();

                                Car car = new Car(brand, rejestracja, model, type);
                                vehicles.add(car);
                                isFind = true;



                                if (isFind)
                                    System.out.println("czy wprowadzić kolejny samochód (jesli tak napisz `tak`)");
                                choise = scanner.next();
                            }
                            while (choise.equalsIgnoreCase("Tak"));
                            break;

                        case 3:
                            do {
                                System.out.println("podaj marke (bez cyfr)");
                                String brand = scanner.next();
                                scanner.nextLine();

                                System.out.println("podaj rejestracje (2 pierwsze znaki to litery, a kolejne znaki to cyfry, conajmniej 2)");
                                String rejestracja = scanner.nextLine();

                                System.out.println("podaj model");
                                String model = scanner.nextLine();

                                System.out.println("czy ma przyczepe (jeśli ma napisz tak)");
                                String przyczepa = scanner.next();

                                scanner.nextLine();
                                Truck truck = new Truck(brand, rejestracja, model, przyczepa);
                                vehicles.add(truck);
                                isFind = true;


                                if (isFind)
                                    System.out.println("czy wprowadzić kolejną ciężarówkę (jesli tak napisz `tak`)");
                                choise = scanner.next();


                            }


                            while (choise.equalsIgnoreCase("Tak"));
                            break;





                    } break;
                case 2:
                    System.out.println("1 - Motor, Do zapłaty masz 5zł/godzina");
                    System.out.println("2 - Samochód, Do zapłaty masz 10zł/godzina");
                    System.out.println("3 - Ciężarówka Do zapłaty masz 15zł/godzina");
                    int usunPojazd = scanner.nextInt();

                    boolean found = false;
                    switch (usunPojazd) {
                        case 1:
                            System.out.println("Podaj numer rejestracyjny pojazdu do usunięcia: (pierwsze 2 litery podaj z shiftem lub caps lockiem)");
                            String rejestracjaMotor = scanner.next();



                            for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
                                Vehicle vehicle = iterator.next();
                                if (vehicle.getRegistration().equals(rejestracjaMotor)) {
                                    iterator.remove();
                                    found = true;
                                    System.out.println("ile godzin był na parkingu?");
                                    int hours = scanner.nextInt();
                                    price = 5;
                                    endPrice += hours * price;
                                    System.out.println("Pojazd o numerze rejestracyjnym " + rejestracjaMotor + " został usunięty.");
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Nie znaleziono pojazdu o numerze rejestracyjnym " + rejestracjaMotor);
                            }
                            break;

                        case 2:
                            System.out.println("Podaj numer rejestracyjny pojazdu do usunięcia:");
                            String rejestracjaSamochod = scanner.next();


                            for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
                                Vehicle vehicle = iterator.next();
                                if (vehicle.getRegistration().equals(rejestracjaSamochod)) {
                                    iterator.remove();
                                    found = true;
                                    System.out.println("Pojazd o numerze rejestracyjnym " + rejestracjaSamochod + " został usunięty.");
                                    System.out.println("ile godzin bedzie na parkingu?");

                                    int hours1 = scanner.nextInt();
                                    price = 10;
                                    endPrice += hours1 * price;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Nie znaleziono pojazdu o numerze rejestracyjnym " + rejestracjaSamochod);
                            }
                            break;

                        case 3:
                            System.out.println("Podaj numer rejestracyjny pojazdu do usunięcia:");
                            String rejestracjaTruck = scanner.next();



                            for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
                                Vehicle vehicle = iterator.next();
                                if (vehicle.getRegistration().equals(rejestracjaTruck)) {
                                    iterator.remove();
                                    found = true;
                                    System.out.println("ile godzin był na parkingu?");
                                    int hours2 = scanner.nextInt();
                                    price = 15;
                                    endPrice += hours2 * price;
                                    System.out.println("Pojazd o numerze rejestracyjnym " + rejestracjaTruck + " został usunięty.");
                                    break;
                                }
                            }


                            if (!found) {
                                System.out.println("Nie znaleziono pojazdu o numerze rejestracyjnym " + rejestracjaTruck);
                            }
                            break;
                    } break;

                case 3:
                    vehicles.add(new MotorBike("Harley-Davidson", "AB123", "Sportster", 1200));
                    vehicles.add(new MotorBike("Honda", "XY789", "CBR600RR", 600));
                    vehicles.add(new MotorBike("Kawasaki", "MN456", "Ninja ZX-10R", 1000));
                    vehicles.add(new MotorBike("Yamaha", "JK321", "YZF-R1", 1000));
                    vehicles.add(new MotorBike("Ducati", "QWE789", "Monster", 821));
                    vehicles.add(new MotorBike("BMW", "PLM678", "S1000RR", 1000));
                    vehicles.add(new MotorBike("Suzuki", "WER456", "GSX-R750", 750));
                    vehicles.add(new Car("Toyota", "ABC111", "Camry", "sedan"));
                    vehicles.add(new Car("Ford", "XYZ222", "Mustang", "coupe"));
                    vehicles.add(new Car("Honda", "MNO333", "Civic", "sedan"));
                    vehicles.add(new Car("Chevrolet", "JKL444", "Corvette", "coupe"));
                    vehicles.add(new Car("Volkswagen", "QWE555", "Golf", "suv"));
                    vehicles.add(new Car("Mercedes-Benz", "PLM666", "C-Class", "sedan"));
                    vehicles.add(new Car("Audi", "WER777", "A4", "sedan"));
                    vehicles.add(new Truck("Volvo", "ABC777", "FH16", "Tak"));
                    vehicles.add(new Truck("Scania", "XYZ888", "R730", "Tak"));
                    vehicles.add(new Truck("Mercedes-Benz", "MNO999", "Actros", "Nie"));
                    vehicles.add(new Truck("MAN", "JKL000", "TGX", "Nie"));
                    vehicles.add(new Truck("Iveco", "QWE111", "Stralis", "Tak"));
                    vehicles.add(new Truck("Kenworth", "PLM222", "W990", "Nie"));
                    vehicles.add(new Truck("Peterbilt", "WER333", "579", "Tak"));

                    System.out.println("Pojazdy dodane automatycznie");
                    for (Vehicle vehicle : vehicles) {
                        vehicle.display();
                        System.out.println("-------------------------");                    }
                    break;
            }
            System.out.println("czy chcesz dodać inny pojazd lub go usunąć (jesli tak napisz `tak`)");
            choise = scanner.next();
        } while (choise.equalsIgnoreCase("Tak"));

        System.out.println("Aktualny status parkingu");
        System.out.println("-------------------------");
        for (Vehicle vehicle : vehicles) {

            vehicle.display();
            System.out.println("-------------------------");
        }

        Parking parking = new Parking(1000, endPrice);


        List<Parking> parkings = new ArrayList<>();
        parkings.add(parking);
        for (Parking parking1 : parkings) {

            System.out.println("-------------------------");
            parking1.displayPrice();
            System.out.println("-------------------------");
                 {
                    parking1.setNumberOfSpots(parking1.getNumberOfSpots() - vehicles.size());
                }
                parking1.display();
            System.out.println("-------------------------");;
                parking1.setNumberOfSpots(parking.getNumberOfSpots() - (parking1.getNumberOfSpots() - vehicles.size()));
                parking1.displaySeats();
            }


    }
}