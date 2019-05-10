package Zad3;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.ArrayList;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public ArrayList<Float> getXY() {
        ArrayList<Float> xy = new ArrayList<>();
        xy.add(0,getX());
        xy.add(1,getY());
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
