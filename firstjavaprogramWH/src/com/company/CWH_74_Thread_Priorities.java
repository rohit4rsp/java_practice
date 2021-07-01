package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        System.out.println("Thankyou!");
        while (i<100){
            System.out.println("Thanks "+ this.getName());
            i++;
        }
    }
}

public class CWH_74_Thread_Priorities {
    public static void main(String[] args) {

        MyThr1 t0 = new MyThr1("Rohit (most priority)");
        MyThr1 t1 = new MyThr1("vedant(min)");
        MyThr1 t2 = new MyThr1("bhagwat(min)");
        MyThr1 t3 = new MyThr1("mihir(min)");
        MyThr1 t4 = new MyThr1("onkya(min)");
        MyThr1 t5 = new MyThr1("digya(min)");

        t0.setPriority(Thread.MAX_PRIORITY);     //in output most times printed
        t1.setPriority(Thread.MIN_PRIORITY);     //in output least times printed
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
        t2.start();
        t3.start();


    }
}
