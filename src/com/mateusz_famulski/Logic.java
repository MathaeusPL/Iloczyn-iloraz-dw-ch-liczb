package com.mateusz_famulski;

import java.util.Scanner;

public class Logic {

    private boolean isNumberOk=true;
    private double testNumber;

    private Scanner skaner = new Scanner(System.in);

    /**
     * Użytkownik podaje liczby do dalszych obliczeń
     * @param number podaje która liczba jest wprowadzana (pierwsza lub druga)
     * @return zwraca liczbę do obliczeń typu double
     */
    public double userInput(String number) {
        do {
            try {
                System.out.println("Podaj "+number+" liczbę: ");
                testNumber=skaner.nextDouble();
                isNumberOk=false;
            } catch (Exception exception){
                System.out.println("Wprowadzono nieprawidłowe dane!");
                skaner.nextLine();
            }
        } while (isNumberOk);
        isNumberOk=true;
        return testNumber;
    }

    /**
     * Metoda liczy iloczyn i iloraz dwóch liczb
     * @param firstNumber pierwsza liczba do obliczeń
     * @param secondNumber druga liczba do obliczeń
     * wykonanie działań i wyświetlenie ich na ekranie
     */
    public void results (double firstNumber, double secondNumber){
        System.out.println("Wybrano liczby: "+firstNumber+" oraz: "+secondNumber+
        "\n\n"+firstNumber+" * "+secondNumber+" = "+firstNumber*secondNumber+
                "\n\n"+firstNumber+" / "+secondNumber+" = "+ firstNumber/secondNumber+"\n");
    }

    /**
     * Metoda wyświetla menu tekstowe z wyborem kontynuacji lub zakończeniem programu
     * @return zmienna od której zależy dalsze działanie pętli
     */
    public boolean isEnd() {
        System.out.println("Co teraz chcesz zrobić ?\n1 - liczymy dalej\nInny znak - zamykamy program");
        String userMenu = skaner.next();
        if (userMenu.equals("1")){
            return true;
        } else {
            return false;
        }
    }
}
