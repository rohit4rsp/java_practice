package com.company;

class T1 extends Thread{
    public void run(){
        int i = 0;
        while(true) {
            System.out.println("thanks");
            i++;
        }
    }
}

class T2 extends Thread{
    public void run(){
        int i = 0;
        while(true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class CWH_76_PSet_THREAD {
    public static void main(String[] args) {

        T1 x = new T1();
        x.setPriority(6);

        T2 y = new T2();
        y.setPriority(9);

        System.out.println(x.getPriority());
        System.out.println(y.getPriority());
        System.out.println(y.getState());

        System.out.println(Thread.currentThread().getState());    //currentThread() gives reference

//        x.start();
//        y.start();
//        System.out.println(y.getState());       ..here it will give runnable


    }
}
