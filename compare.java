Write a program to compare two numbers.
    
AIM:
    To write a program to compare two numbers.
        
PROCEDURE:
          STEP-1: Import the Java Scanner to get input from the user.
          STEP-2: Declare teh variables that we are about to use.
          STEP-3: Instantiate the Scanner class.
          STEP-4: Get two numbers as input from the user.
          STEP-5: To compare two numbers and print the output.
          Step-6: Close the object of the Scanner class.

CODE:

import java.util.Scanner;

public class compare {
    public static void main(String args[]) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextInt();
        System.out.print("Enter a number: ");
        b = s.nextInt();
        if (a == b) {
            System.out.println("Numbers are the same.");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
        s.close();
    };
}

OUTPUT:

PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac compare.java
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java comapre
Error: Could not find or load main class comapre
Caused by: java.lang.ClassNotFoundException: comapre
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac compare.java
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java compare      
Enter a number: 5
Enter a number: 5
Numbers are the same.
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> 
