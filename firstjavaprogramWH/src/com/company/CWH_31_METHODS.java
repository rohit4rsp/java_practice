package com.company;
public class CWH_31_METHODS {

    // ......SYNTAX of METHODS......
    //dataType name() {
    // method body
    // }

    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y) * 5;
        }
        return z;

    }


    public static void main(String[] args) {

        int a=7;
        int b=6;
        int c;
       // CWH_31_METHODS obj= new CWH_31_METHODS();    .....for calling method using object is STATIC not used in line10
       // c= obj.logic(a,b);
        c= logic(a,b);
        System.out.println(c);





    }
}
