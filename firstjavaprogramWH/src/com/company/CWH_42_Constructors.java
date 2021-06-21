package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){           //....if arguments not passed, this will run
        id = 7;
        name = "Your_Name_Here";
    }

    public MyMainEmployee(int myId,String myName){     //...if argumens passed
        id = myId;
        name = myName;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }

}

public class CWH_42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee rohit = new MyMainEmployee(7,"ROHIT");   //....constructor
        //rohit.setName("ROHIT");    .......constructors used to set values altogether
        //rohit.setId(7);
        System.out.println(rohit.getName());
        System.out.println(rohit.getId());
    }
}
