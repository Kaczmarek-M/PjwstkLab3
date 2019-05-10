package Zad4;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("czerwony" ,true, 12);
        Rectangle rectangle = new Rectangle("czerwony", true, 12, 10);
        Square square = new Square(10, "white", true);
        double newRadius;
        double newWidth;
        double newLenght;
        String newColor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kolor");
        newColor = sc.nextLine();
        circle.setColor(newColor);
        rectangle.setColor(newColor);
        square.setColor(newColor);
        System.out.println("Podaj promien kola");
        newRadius = sc.nextDouble();
        circle.setRadius(newRadius);
        System.out.println("Podaj wysokosc");
        newWidth = sc.nextDouble();
        rectangle.setWidth(newWidth);
        square.setWidth(newWidth);
        System.out.println("Podaj dlugosc");
        newLenght = sc.nextDouble();
        rectangle.setLenght(newLenght);
        System.out.format("Kolor: " + circle.getColor() + ", Pole kola wynosi:  \"%.2f%n\"" , circle.getArea());
        System.out.println(rectangle);
        System.out.println(square);
    }
}
