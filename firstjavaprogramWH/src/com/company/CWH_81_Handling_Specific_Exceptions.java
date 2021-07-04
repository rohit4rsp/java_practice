package com.company;
              //.....SYNTAX....
/*try (
           // code
        )
        Catch (To Exception e) - .....Handle all Exceptions of type IO Exception
            // code
        )
        Catch (Exception e) - .....Handle all Exceptions of type Arithmetic Exception
            // code
        )
        Catch (Exception e) - .....Handle all other Exceptions
            // code
        )*/

import java.util.Scanner;

public class CWH_81_Handling_Specific_Exceptions {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 57;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Index for value");
        int index = sc.nextInt();

        System.out.println("Enter the number u want to divide the value with:");
        int number = sc.nextInt();

        System.out.println("\t TRY-CATCH implemented here...");
        try{
            System.out.println("The value of Entered Array index is: " + marks[index]);
            System.out.println("The value of Array-value/number is: " + marks[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Occurred..! -- "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred..! -- "+e);
        }
        catch (Exception e){
            System.out.println("Some Other Exception Occurred..! -- "+e);
        }


    }
}
