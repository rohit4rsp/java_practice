package com.company;
          // ....ABSTRACT METHOD AND CLASS....

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a Parent2 Constructor");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }

    @Override
    public void greet2() {
        System.out.println("Good night");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }

}


public class CWH_53_Abstract_ClassMeth {
    public static void main(String[] args) {

//        Parent2 p = new Parent2();        // Error ....abstract class obj cannot be instantiated
//        Child3 c = new Child3();          //Error

        Child2 c = new Child2();

    }
}
