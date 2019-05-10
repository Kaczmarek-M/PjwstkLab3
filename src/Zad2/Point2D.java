package Zad2;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.ArrayList;

public class Point2D {
    private float x ;
    private float y ;

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public ArrayList<Float> getXY(){
        ArrayList xy = new ArrayList();
        xy.add(0,getX());
        xy.add(1,getY());
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
