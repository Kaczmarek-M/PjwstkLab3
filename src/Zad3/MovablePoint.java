package Zad3;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.ArrayList;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed() {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed() {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public ArrayList<Float> getSpeed() {
        ArrayList<Float> speed = new ArrayList<>();
        speed.add(0, getxSpeed());
        speed.add(1, getySpeed());
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", speed=" + getSpeed() +
                '}';
    }

    public MovablePoint Move() {
        float x1, y1;
        MovablePoint movablePoint = new MovablePoint(getX(), getY(), getxSpeed(), getySpeed());
        x1 = getX();
        x1 += xSpeed;
        y1 = getY();
        y1 += ySpeed;
        movablePoint.setXY(x1, y1);
        return movablePoint;
    }
}
