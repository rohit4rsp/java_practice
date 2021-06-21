package com.company;

class A{
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("\nI am method 2 of class A");
    }
}
class B extends A{
    @Override         //..to know if method is overridden
    public void meth2(){
        System.out.println("\nI am method 2 of class B");
    }
    public void meth3(){
        System.out.println("\nI am method 3 of class B");
    }
}

public class CWH_48_Method_Overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();   //....inherit

    }
}
