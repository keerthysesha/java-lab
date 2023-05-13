AIM:
	To write a java program to print the arithmetic operations.
         
PROCEDURE:
    STEP-1: Import the Java Scanner to get input from the user.
    STEP-2: Declare teh variables that we are about to use.
    STEP-3: Instantiate the Scanner class.
    STEP-4: Get two numbers as input from the user.
    STEP-5: Perform all arithmetic operations such as Addition,Difference,Product,Quotient and Modulus and print the output.
    Step-6: Close the object of the Scanner class.

 CODE:

import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        int i, a, b;
        System.out.println("\t---------------------------");
        System.out.println("\t|        CALCULATOR       |");
        System.out.println("\t---------------------------");
        System.out.println("\t|     1.ADDITION          |");
        System.out.println("\t|     2.SUBTRACTION       |");
        System.out.println("\t|     3.MULTIPLICATION    |");
        System.out.println("\t|     4.DIVISION          |");
        System.out.println("\t---------------------------");
        Scanner s = new Scanner(System.in);

        int t = 1;
        String c;
        do {
            System.out.print("\tEnter your choice: ");
            i = s.nextInt();
            System.out.print("\tEnter a number: ");
            a = s.nextInt();
            System.out.print("\tEnter a number: ");
            b = s.nextInt();
            switch (i) {
                case 1:
                    System.out.println("\tTOTAL: " + (a + b));
                    break;
                case 2:
                    System.out.println("\tDIFFERENCE: " + (a - b));
                    break;
                case 3:
                    System.out.println("\tPRODUCT: " + (a * b));
                    break;
                case 4:
                    System.out.println("\tQUOTIENT: " + (a / b));
                    break;
                default:
                    System.out.println("\tEnter a valid choice.");
                    break;
            }
            System.out.print("\tDo You still wanna continue?(Y/N)");
            c = s.next();

            if (c.equals("Y") || c.equals("y")) {
                t = 1;
                System.out.println("----------------------------------------------");
            } else {
                t = 0;
            }
        } while (t != 0);
        s.close();
    };
}

OUTPUT:

PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> javac w1a7.java
PS C:\Users\phoen\OneDrive\Documents\Java Full Stack> java w1a7      
        ---------------------------
        |        CALCULATOR       |
        ---------------------------
        |     1.ADDITION          |
        |     2.SUBTRACTION       |
        |     3.MULTIPLICATION    |
        |     4.DIVISION          |
        ---------------------------
        Enter your choice: 2
        Enter a number: 56
        Enter a number: 26
        DIFFERENCE: 30
        Do You still wanna continue?(Y/N)y
----------------------------------------------
        Enter your choice: 3
        Enter a number: 5
        Enter a number: 6
        PRODUCT: 30

