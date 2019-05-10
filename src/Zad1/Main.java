package Zad1;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newPay;
        int choice;
        int newFee;

        Student stu1 = new Student("Michal", "Gdansk ", "C#", 1, 4.500);
        Student stu2 = new Student("Maciej", "Gdansk ", "Java", 2, 4.600);
        Staff sta1 = new Staff("Marek", "Warszawa", "PJWSTK", 10000);
        Staff sta2 = new Staff("Slawek", "Wroclaw", "PJWSTK", 9400);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        ArrayList<Staff> list1 = new ArrayList<>();
        list1.add(sta1);
        list1.add(sta2);

        for (Student stu : list) {
            System.out.println(stu);
        }
        System.out.println("Jezeli chcesz zmienic saldo oplaty studenta 1 wcisnij 1");
        System.out.println("Jezeli chcesz zmienic saldo oplaty studenta 2 wcisnij 2");
        System.out.println("Jezeli chcesz zmienic zaplate dla wykladowcy 1 wcisnij 3");
        System.out.println("Jezeli chcesz zmienic zaplate dla wykladowcy 2 wcisnij 4");
        System.out.println("Jezeli zakonczyc program wcisnij dowolna liczbe");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Podaj saldo");
                newFee = scanner.nextInt();
                stu1.setFee(newFee);
                break;
            case 2:
                System.out.println("Podaj saldo");
                newFee = scanner.nextInt();
                stu2.setFee(newFee);
                break;
            case 3:
                System.out.println("Podaj pensje");
                newPay = scanner.nextInt();
                sta1.setPay(newPay);
                break;
            case 4:
                System.out.println("Podaj pensje");
                newPay = scanner.nextInt();
                sta2.setPay(newPay);
                break;
            default:
                System.out.println("Koniec programu");
                break;
        }
        for (Student student : list){
            System.out.println(student);
        }
        for (Staff staff : list1){
            System.out.println(staff);
        }
    }
}