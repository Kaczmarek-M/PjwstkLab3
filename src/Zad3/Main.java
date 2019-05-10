package Zad3;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();
        float newX;
        float newY;
        float newXspeed;
        float newYspeed;
        int choice = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println(movablePoint.Move());
        System.out.println("Podaj x");
        newX = sc.nextFloat();
        System.out.println("Podaj Y");
        newY = sc.nextFloat();
        movablePoint.setXY(newX, newY);
        while (choice != 0){
            System.out.println("Podaj predkosc x");
            newXspeed = sc.nextFloat();
            System.out.println("Podaj predkosc y");
            newYspeed = sc.nextFloat();
            movablePoint.setSpeed(newXspeed, newYspeed);
            System.out.println(movablePoint.Move());

            System.out.println("\nJezeli chcesz zakonczyc wcisnij 0");
            choice = sc.nextInt();
        }
        System.out.println("\nDozobaczenia");
    }
}
