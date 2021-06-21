package com.company;

public class CWH_29_Array_PSet {
    public static void main(String[] args) {

        //Problem 1

       /* float[] numbers = {33f,45f,6.7f};
        float sum = 0;
        for(float element:numbers){
            sum = sum + element;
        }
        System.out.println("sum of numbers in array is: "+sum);*/

        //Problem 2

        /*float[] marks = {33f,45f,6.7f};
        float a1 = 45f;
        boolean IsInArray = false;
        for(float element:marks){
            if(a1==element){
                IsInArray = true;
                break;

            }

        }
        if(IsInArray) {
            System.out.println("\ta1 is in array");
        }
        else {
            System.out.println("\ta1 is not in array");
        }*/


        //Problem 3

       /* float[] physics = {22f,33f,44f,56f,67f};
        float sum = 0;
        for (float element: physics){
            sum = sum + element;

        }
        float avg = sum/physics.length;
        System.out.println(avg);*/


        //Problem 4

        /*int[][] mat1 = {{1,2,3},
                        {2,4,5}};
        int[][] mat2 = {{2,5,8},
                        {5,5,7}};
        int[][] result = {{0,0,0},
                          {0,0,0}};

        for (int i=0; i<mat1.length; i++)  {           //row no of times

            for (int j=0; j<mat1[i].length; j++)  {     //column number of times
                System.out.format("setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];


            }

        }

        for (int i=0; i<mat1.length; i++)  {           //row no of times

            for (int j=0; j<mat1[i].length; j++)  {     //column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }

            System.out.println("");

        }*/

        //Problem 5

        /*System.out.println("\tReversing an ARRAY");
        int[] nos = {2,4,5,6};
        int l= nos.length;
        int n = Math.floorDiv(l,2);                    // .....Math.floorDiv(,);
        int temp;
        for(int i=0; i<n; i++){
            //swap a[i] and a[l-i-1]
            temp = nos[i];
            nos[i] = nos[l-i-1];
            nos[l-i-1] = temp;

        }
        for(int element:nos){
            System.out.print(element);
            System.out.print(" ");
        }*/

        //Problem 6

        /*System.out.println("\n\t***  Maximum no of array  ***");
        int[] arr = {2,4,5,6};
        int max=0;
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }

        System.out.println("The Maximum number is: "+max);*/

        //Problem 7

        /*System.out.println("\n\t***  Minimum no of array  ***");
        int[] arr = {2,4,5,6};
        int min= Integer.MAX_VALUE;                   //.... Integer.MAX_VALUE
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }

        System.out.println("The Maximum number is: "+min);*/

        //Problem 8

        /*System.out.println("** Sorting array **");
        int[] array= {33,44,334,56,433};
        boolean IsSorted= false;
        for(int i=0; i< array.length-1;i++){
            if(array[i]>array[i+1]){
                IsSorted = true;
                break;
            }
        }
        if(IsSorted){
            System.out.println("\nNOT Sorted");


        }
        else {
            System.out.println("\t\nSORTED");
        }*/




    }
}
