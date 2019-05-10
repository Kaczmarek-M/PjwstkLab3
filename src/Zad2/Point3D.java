package Zad2;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.util.ArrayList;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
        super();
        z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public ArrayList<Float> getXYZ() {
        ArrayList<Float> xyz = new ArrayList<>();
        xyz.add(0,getX());
        xyz.add(1,getY());
        xyz.add(2,getZ());
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }
}
