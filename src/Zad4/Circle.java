package Zad4;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*Math.PI*2;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "color= " + getColor() +
                ", filled " + isFilled() +
                ", radius = " + radius +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
