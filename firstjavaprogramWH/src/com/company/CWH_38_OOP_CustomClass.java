package com.company;
       //Class
class Employee{
    int id;
    String name;
    public void printDetails(){                          //using Method
        System.out.println("my id is: "+id);
        System.out.println("and my name is: "+name);
    }
}

public class CWH_38_OOP_CustomClass {
               //MAIN FUNCTION
    public static void main(String[] args) {
        System.out.println("\tOOP IMPORTANT TOPIC\n This is our custom Class");

        Employee rohit = new Employee();  //...instantiating a new Employee obj.
        Employee john = new Employee();
                 //Setting Attributes
        rohit.id = 7;
        john.id = 7;
        rohit.name="Rohit_Patil";
        john.name="John_Maddinson";
                //Printing attributes
        //System.out.println(rohit.id);
        //System.out.println(rohit.name);
        rohit.printDetails();      //....using method
        john.printDetails();

    }
}
