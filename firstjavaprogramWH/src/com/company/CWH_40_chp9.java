package com.company;

class MyEmployee{
    private int id;
    private String name;

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

public class CWH_40_chp9 {
    public static void main(String[] args) {

        MyEmployee rohit = new MyEmployee();
        //rohit.id = 7;
        //rohit.name = "Rohit_Patil";      .....throws error due to private accessifier
        rohit.setName("Rohit_Patil");
        System.out.println(rohit.getName());
        rohit.setId(7);
        System.out.println(rohit.getId());


    }
}
