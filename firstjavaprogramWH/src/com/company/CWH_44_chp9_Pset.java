package com.company;

class Cylinder{
    private int radius,height;

    public Cylinder() {
        this.radius = 4;
        this.height = 5;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2*Math.PI * radius * height;
    }


}

public class CWH_44_chp9_Pset {
    public static void main(String[] args) {
                   //Problem 1,2
        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(5);
//        int h = myCylinder.getHeight();
//        int r = myCylinder.getRadius();
//        System.out.println(h);
//        System.out.println(r);
        System.out.println(myCylinder.surfaceArea());

    }
}
