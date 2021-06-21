package com.company;

class Employee1{
    String name;
    int salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public String getName() {
        return name;
    }



    public int getSalary() {
        return salary;
    }


}

class CellPhone{
    public void ring(){
        System.out.println("is Ringing....");
    }

    public void vibrate(){
        System.out.println("is Vibrating...");
    }

    public void callFriend(){
        System.out.println("\ncalling Vedant...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public  int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int side,breadth;
    public int areaRec(){
        return side*breadth;
    }
    public  int perimeterRec(){
        return 2*(side+breadth);
    }
}


public class CWH_39_Pset_oop {

    public static void main(String[] args) {
       /*      //Problem 1
        Employee1 rohit = new Employee1();

        //rohit.name = "rohit";
        rohit.setName("Rohit");
        rohit.getName();
        System.out.println(rohit.getName());
        //rohit.salary = 33;
        rohit.setSalary(33);
        rohit.getSalary();
        System.out.println(rohit.getSalary());*/

                  /*//Problem 2
        CellPhone oppo = new CellPhone();
        oppo.callFriend();
        oppo.ring();
        oppo.vibrate();*/

          /* //Problem 3
        Square sq = new Square();
        sq.side = 2;
        System.out.println();
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/

         /*  //Problem 4
        Rectangle rec = new Rectangle();
        rec.side = 2;
        rec.breadth = 3;
        System.out.println();
        System.out.println(rec.areaRec());
        System.out.println(rec.perimeterRec());*/

                 //Problem 5



    }
}
