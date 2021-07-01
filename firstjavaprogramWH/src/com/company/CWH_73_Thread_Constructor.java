package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        System.out.println("Thankyou!");
//        while (i<20){
//            System.out.println("i am a thread");
//            i++;
//        }
    }
}

public class CWH_73_Thread_Constructor {
    public static void main(String[] args) {

        MyThr t0 = new MyThr("Rohit");
        MyThr t1 = new MyThr("vedant");
        t0.start();


        System.out.println("the id of the thread t0 is: "+ t0.getId());
        System.out.println("the name of the thread t0 is: "+ t0.getName());

        System.out.println("\nthe id of the thread t1 is: "+ t1.getId());
        System.out.println("the name of the thread t1 is: "+ t1.getName());

    }
}
