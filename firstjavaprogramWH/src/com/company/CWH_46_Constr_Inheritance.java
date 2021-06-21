package com.company;

class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor with value of x as: "+ x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    public int y;
    Derived1(){
//        super(0);          ...super keyword
        System.out.println("I am Derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor with value of y as: "+ y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of child of derived class with value of z: "+z);
    }
}


public class CWH_46_Constr_Inheritance {
    public static void main(String[] args) {

        Base1 b = new Base1();
        System.out.println();

        Derived1 d = new Derived1();
        System.out.println();

        Derived1 d1 = new Derived1(14,9);
        System.out.println();

        ChildOfDerived c = new ChildOfDerived();
        System.out.println();

        ChildOfDerived c1 = new ChildOfDerived(2,3,4);




    }
}
