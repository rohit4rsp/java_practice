package com.company;

class Phone{
    public void showTime(){
        System.out.println("showing Time");
    }
    public void on(){
        System.out.println("Turn on Phone");
    }
}
class Smartphone extends Phone{
    @Override
    public void on(){
        System.out.println("Turn on Smartphone");
    }
    public void music(){
        System.out.println("playing Music!");
    }
}


public class CWH_49_Dynamic_MethodDispatch {
    public static void main(String[] args) {

        Phone obj = new Phone();      //allowed
        Smartphone smobj = new Smartphone();     //allowed

        Phone obj2 = new Smartphone();     // Yes it is allowed..........IMPORTANT

//        Smartphone obj3 = new Phone();     // not allowed

        obj2.on();    //runtime polymorphism
        obj.on();
        obj.showTime();
//        obj.music();  // not allowed
        smobj.music();


    }
}
