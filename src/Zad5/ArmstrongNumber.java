package Zad5;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number;
        int secNumb;
        int thirdNum = 0;
        int temporary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe trzycyfrowa");
        number = sc.nextInt();

        temporary = number;

        while (number > 0) {
            secNumb = number % 10;
            number = number / 10;
            thirdNum = thirdNum + (secNumb * secNumb *secNumb);
        }
        if (temporary == thirdNum){
            System.out.println("Jest to liczba Armstronga");
        }else {
            System.out.println("Nie jest to liczba Armstronga");
        }
    }
}
