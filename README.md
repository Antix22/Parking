Klasy pojazdów:

Vehicle: Jest to klasa bazowa, która reprezentuje ogólny pojazd. Posiada pola takie jak marka, rejestracja i model. W tej klasie również zawarta jest obsługa poprawności danych podczas wprowadzania marki i rejestracji.
W klasie Vehicle są dwie walidacje:
Marka (brand): Korzystając z wyrażenia regularnego [A-Za-z-]+, sprawdzane jest, czy marka składa się tylko z liter lub myślników.
Rejestracja (registration): Sprawdzane jest, czy rejestracja ma co najmniej 3 znaki i czy dwa pierwsze znaki to litery, a reszta to cyfry.

Car: Rozszerza klasę Vehicle, dodając dodatkowe pole "type", które reprezentuje typ samochodu, takie jak sedan, suv, kabriolet lub coupe.
W przypadku dodawania samochodu (Car) walidacja odnosi się do pola "type", gdzie sprawdzane jest, czy typ samochodu należy do jednego z czterech akceptowalnych typów: "sedan", "suv", "kabriolet" lub "coupe".

MotorBike: Rozszerza klasę Vehicle, dodając pole "pojemnosc", które reprezentuje pojemność silnika motocykla.
W przypadku dodawania motocykla (MotorBike) walidacja dotyczy pola "pojemnosc", gdzie za pomocą pętli while sprawdzane jest, czy pojemność silnika jest większa niż zero.

Truck: Rozszerza klasę Vehicle, dodając pole "isTrailer", które informuje, czy ciężarówka ma przyczepę.
W przypadku dodawania ciężarówki (Truck) walidacja odnosi się do pola "isTrailer", gdzie sprawdzane jest, czy użytkownik wprowadził "tak" lub coś innego jako odpowiedź.
Parking: Klasa reprezentująca parking, która przechowuje informacje o liczbie miejsc i cenie. Zawiera również metody do wyświetlania dostępnych miejsc i ceny.

Main (Główna klasa programu):

Początkowo definiuje obiekt Scanner i listę pojazdów (vehicles).
W pętli do-while użytkownik ma możliwość dodawania lub usuwania pojazdów.
W zależności od wyboru użytkownika:
Dodanie pojazdu ręcznie (MotorBike, Car, Truck) - użytkownik podaje różne informacje w zależności od typu pojazdu.
Usunięcie pojazdu - użytkownik podaje numer rejestracyjny, a system usuwa pojazd z listy i oblicza cenę ,cena jest obliczana tylko po usunięciu pojazdu z parkingu, ponieważ gdy samochód wjeżdza na praking i odrazu miałbym za niego płacić to byłaby możliwość, że wyjade za późno dlatego program pyta się ile godzin stał na parkingu.
Dodanie pojazdów automatycznie - dodaje 21 pojazdów do listy.
Po zakończeniu pętli wyświetla aktualny stan parkingu, obliczoną cenę oraz dostępne miejsca na parkingu.
