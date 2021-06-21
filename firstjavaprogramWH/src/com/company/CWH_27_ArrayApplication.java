package com.company;

public class CWH_27_ArrayApplication {

    public static void main(String[] args) {

        int [] marks={22,55,65,77,89};
        float[] per={44f,6.6f,77f,8.8f,7.8f};
        String[] name= {"rohit","harsh","nikhil","sneha"};

        System.out.println(marks.length);
        System.out.println(per[2]);
        System.out.println(name[2]);

        //Displaying an Array using  .... .FOR LOOP

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //Displaying an Array using FOR LOOP in   .... .Reverse

        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //Displaying an Array using ..... .FOR EACH LOOP

        for(int element: marks){
            System.out.println(element);
        }



    }
}
