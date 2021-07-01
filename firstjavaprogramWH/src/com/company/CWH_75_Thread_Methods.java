package com.company;

class NewMyThr1 extends Thread{
    public void run(){
//        int i = 0;
        while (true){
            System.out.println("CodeWithHarry");
//            i++;
        }
    }
}
class NewMyThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("ThankYou!");
            try {
                Thread.sleep(1);         //delays 1 milliseconds..  #exceptions thrown
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class CWH_75_Thread_Methods {
    public static void main(String[] args) {

        NewMyThr1 t1 = new NewMyThr1();
        NewMyThr2 t2 = new NewMyThr2();
        t1.start();

//        try {
//            t1.join();                //holds t2 till t1 is executed
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();

//        t1.join();    //throws an exception

    }
}
