package com.company;

class MyThread1 extends Thread{      //Thread Class
    public void run(){
        int i = 0;
        while (i<20){
            System.out.println("My Thread is running..");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<20){
            System.out.println("Thread 2..");
            System.out.println("I am Sad");
            i++;
        }
    }
}


public class CWH_70_JavaThreadBasic {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

//        t1.run();       ...does not run


    }
}
