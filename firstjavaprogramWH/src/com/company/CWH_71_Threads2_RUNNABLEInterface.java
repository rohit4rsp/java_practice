package com.company;

class MyThreadRunnable1 implements Runnable{
    int i = 0;
    @Override
    public void run() {
        while (i<25) {
            System.out.println("I am a Thread not a threat");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    int i = 0;
    @Override
    public void run() {
        while (i<25) {
            System.out.println("I am a Thread 2 not a threat...");
            i++;
        }
    }
}

public class CWH_71_Threads2_RUNNABLEInterface {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
//        bullet1.start();   ....will not run here
    }
}
