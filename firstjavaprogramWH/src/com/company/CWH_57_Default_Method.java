package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
//    private void greet(){
//        System.out.println("Good Morning");
//    }
    default void record4K(){            //....DEFAULT Method
//        greet();
        System.out.println("recording in 4K");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(double phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting.... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
    public void record4K() {                     //default method overrided will run first
        System.out.println("recording video in 4K");
    }
}



public class CWH_57_Default_Method {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();

        String[] ar = ms.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }

        ms.record4K();

    }
}
