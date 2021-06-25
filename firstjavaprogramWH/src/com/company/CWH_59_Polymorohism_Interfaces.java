package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
//    private void greet(){
//        System.out.println("Good Morning");
//    }
    default void record4K2(){            //....DEFAULT Method
//        greet();
        System.out.println("recording in 4K");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(double phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting.... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video!");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting Lists of networks..");
        String[] networkList = {"harry", "rohit", "vedant"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to Network..." + network);
    }

    @Override
    public void record4K2() {                     //default method overrided will run first
        System.out.println("recording video in 4K");
    }
}



public class CWH_59_Polymorohism_Interfaces {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2();
        cam1.recordVideo();

        MySmartPhone2 ms = new MySmartPhone2();
        System.out.println("");
        ms.recordVideo();
        ms.callNumber(899909);

//        cam1.getNetworks();  --> Not Allowed


    }
}
