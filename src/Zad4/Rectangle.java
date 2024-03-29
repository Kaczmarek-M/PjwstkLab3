package Zad4;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle() {
        width = 1.0;
        lenght = 1.0;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width*lenght;
    }

    public double getPerimeter() {
        return 2*width + 2*lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght= " + lenght +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }
}
