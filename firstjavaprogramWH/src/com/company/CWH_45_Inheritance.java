package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }

}

class Derived extends Base{         //... extends --> keyword
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CWH_45_Inheritance {
    public static void main(String[] args) {
        //creating object of base class
        Base b = new Base();        //.... y from derived class cannot be accessed
        b.setX(4);
        System.out.println(b.getX());

        //creating object of derived class
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());


    }
}
