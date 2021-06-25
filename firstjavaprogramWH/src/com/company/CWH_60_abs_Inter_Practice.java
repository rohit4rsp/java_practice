package com.company;
                        //....PROBLEM 1,2....
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Write...");
    }

    @Override
    void refill() {
        System.out.println("Refill...");
    }

    void changeNib(){
        System.out.println("Changing the Nib!");
    }
}

                  //.....PROBLEM 3......

class Monkey{
    void jump(){
        System.out.println("JUMP");
    }
    void bite(){
        System.out.println("BITE");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
    default void dance(){
        System.out.println("I am Dancing..");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir..!");
    }

    @Override
    public void eat() {
        System.out.println("EAT");
    }

    @Override
    public void sleep() {
        System.out.println("SLEEP");
    }

    @Override
    public void dance() {
        System.out.println("DANCE....executed if Override");
    }
}


public class CWH_60_abs_Inter_Practice {
    public static void main(String[] args) {

                 //problem 1,2

        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();

                //problem 3

        Human h = new Human();
        h.bite();
        h.dance();
        h.eat();
        h.sleep();
        h.jump();

                //Problem 5

        Monkey m = new Human();
        m.bite();
        m.jump();
//        m.speak(); --> cannot use #polymorphism




    }
}
