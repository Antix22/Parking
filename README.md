# Parking 
Projekt parkingu:
Klasa vehicle posiada pola brand, registration, model
pole brand przyjmuje tylko litery, registration piersze 2 znaki są literami a kolejne to cyfry, co najmniej 2, model to dowolny ciąg znaków
klasa MotorBike posiada pole pojemnośc oraz dzieciczy po vehicle, nie można wprowadzić liczby mniejszczej od 0
klasa car posiada pole type oraz dzieciczy po vehicle, może przyjmować jedynie typy nadwozia, takie jak sendan, suv, kabriolet oraz coupe
klasa truck posiada pole istrailer oraz dzieciczy po vehicle, jeśli pole ma wartośc "tak" to cieżarówka będzie miała przyczepe, w innym wypadku pole to bedzie puste
klasa parking posiada pole price oraz numberOfseats oraz nie mogą one być mniejsze od 0
w mainie pojazdy dadaje i usuwam poprzez switcha, w tym switchu jest drgui switch, pierwszy jest od dodawania a drugi od usuwania.
pojazdy dodają się do listy a usuwają poprzez iterator, usuwają się one na podstawie rejestracji
Każdy pojazd ma przypisaną cene która wynosi dla motory 5zł, samochodu 10zł a ciężarówka 15zł
ceny te są za godzine, płaci się dopiero przy wyjeżdżaniu z parkingu(usuwaniu) wtedy trzeba podać ile godzin pojazd stał na parkingu
parking ma przypisaną liczbę miejsc 1000
miejsca na parkingu po dodaniu pojazdu usuwają się, oraz dodają przy usuwaniu
miejsca są wypisywane przez metode displaySeats() z klasy Parking
pojazdy są wypisywane przez metode display z klasy vehicle,
cena jest wypisywania przez displayPrice z klasy parking
cena wynosi cena * ilosc godzin

