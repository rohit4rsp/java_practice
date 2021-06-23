package com.company;
               // Multiple Inheritance Not Allowed in JAVA

class CellPhone1{
    CellPhone1(){
        System.out.println("default constructor");
    }
    void call(){
        System.out.println("Calling Feature");
    }
}

interface Feature{
    void gps();
    void camera();
    void mediaPlayer();
}

class SmartPhone1 extends CellPhone1 implements Feature {

    @Override
    void call() {
        super.call();
    }

    @Override
    public void gps() {
        System.out.println("shows Location");
    }

    @Override
    public void camera() {
        System.out.println("Opens Camera");
    }

    @Override
    public void mediaPlayer() {
        System.out.println("Playing media");
    }
}


public class CWH_56_MultiInherit_UsingJAVA {
    public static void main(String[] args) {

        SmartPhone1 sp = new SmartPhone1();
        sp.call();
        sp.camera();
        sp.gps();
        sp.mediaPlayer();



    }
}
