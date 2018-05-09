package com.mateusz_famulski;

/**
 Program oblicza iloczyn i iloraz dwóch podaych przez użytkownika liczb. Projekt zawiera się w dwóch klasach Main oraz Logic.
 Program testowany na poprawnych danych wejściowych nie ujawnił błędów.Zastosowano obsługę wyjątków w przypadku
 wprowadzenia przez użytkownika błędnego rodzaju danych. Przetestowano program przy błędnych danych w tym wpisanie
 dzielnika jako zero - program dobrze obsługuje błędy. Program pisany w IntelliJ IDEA na Windows 10. Wersja javy "1.8.0_144".

 @author Mateusz Famulski
 @version 0.2
 */
public class Main {

    /**
     * Wywołanie metod z klasy Logic, umieszczenie ich w pętlach, dokonanie stosownych obliczzeń i wyświetlenie rezultatu.
     * @param args domyślny parametr metody main.
     */
    public static void main(String[] args) {

        double secondNumber;
        Logic user = new Logic();
        System.out.println("Liczymy iloczyn i iloraz dwóch liczb!\n");


        do { //pierwsza pętla odbierania danych i wykonania obliczeń

            double firstNumber = user.userInput("pierwszą");
            do { // zagnieżdżona pętla do odebrania drugiej liczby oraz sprawdzeniem czy nie jest to zero
                secondNumber = user.userInput("drugą");
                if (secondNumber==0){
                    System.out.println("NIE DZIELIMY PRZEZ ZERO !!!\n");
                }
            } while (secondNumber==0);

            user.results(firstNumber,secondNumber);
        } while (user.isEnd());
    }
}
