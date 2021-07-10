package com.company;

/*
ArrayList Vs. LinkedList :

    Although ArrayList & LinkedList both implement the List interface and have the same methods,
it is important to understand when to use which one.
    The insertion & deletion can be done in constant time in Linked List,
so it is best to use the linked list when you need to add or remove elements frequently.
    Use ArrayList when you want to access the random elements frequently,
as it can’t be done in a linked list in constant time.

Performing various operations on LinkedList :
 *Adding Element in LinkedList:
Similar to ArrayList,
 * add() method is used to add elements in a linked list.
 * add(Object): Inserts an element at the end of the ArrayList.
 * add(Index,Object) : Inserts an element at the given index

 */
import java.util.LinkedList;    //import LinkedList


public class CWH_92_LinkedList_Demo_Methods {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);     // Inserts 5 at index 0
        l1.add(0, 1);
        l1.addAll(0, l2);

        l1.addLast(676);         //Inserting 676 at the end of L1

        l1.addFirst(788);        //Inserting 788 at the starting of L1

        l1.remove(2);         //removes element present at 2nd index

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        //l1.clear();

        l1.set(1, 566);     //changes element present at 1st index

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
