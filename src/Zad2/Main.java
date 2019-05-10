package Zad2;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float newX;
        float newY;
        float newZ;

        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj x");
        newX = sc.nextFloat();
        System.out.println("Podaj y");
        newY = sc.nextFloat();
        point2D.setXY(newX,newY);
        System.out.println("Podaj Z");
        newZ = sc.nextFloat();
        point3D.setXYZ(newX,newY,newZ);

        System.out.println("X i Y = " + point2D.getXY());
        System.out.println("X, Y, Z = " + point3D.getXYZ());
    }
}
