package Zad4;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

public class Square extends Rectangle {


    public Square() {

    }

    public Square(double side) {
        side = getWidth();
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        side = getWidth();
    }

    public void setWidth(double side) {
        side = getWidth();
    }

    public double getSide(double side) {
        return side;
    }

    public void setLenght(double side) {
        side = getLenght();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + getSide(getWidth()) +
                ", color= " + getColor() +
                ", filled= " + isFilled() +
                '}';
    }
}
