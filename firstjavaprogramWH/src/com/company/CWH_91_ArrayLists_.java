package com.company;
import java.util.*;

public class CWH_91_ArrayLists_ {
    public static void main(String[] args) {

        //ArrayList<Integer> l1;
        // l1 = new ArrayList<>();
        //....type 1

//        ArrayList<Integer> l2 = new ArrayList<>(5);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        //l1.ensureCapacity(100);

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        l1.add(0);

        l1.add(0,49);
        l1.add(1,50);
        l1.add(2,60);

        l1.addAll(0,l2);

//        l1.clear();

        System.out.println(l1.contains(7));

        System.out.println("\n"+l1.indexOf(0));
        System.out.println(l1.lastIndexOf(0));
        System.out.println("");

        for (int i=0; i<=l1.size(); i++){
//            System.out.println(l1[i]);    .......not accessible
            System.out.print(l1.get(i));   //....use #get for printing arraylist
            System.out.print(", ");

        }



    }
}
