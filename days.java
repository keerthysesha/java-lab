Write a program to find the no of days in a month.
    
AIM:
    To write a program to find the no of days in a month.
        
PROCEDURE:
          STEP-1: Import the Java Scanner to get input from the user.
          STEP-2: Declare teh variables that we are about to use.
          STEP-3: Instantiate the Scanner class.
          STEP-4: Get two numbers as input from the user.
          STEP-5: Find the no of days in a month and print the output.
          Step-6: Close the object of the Scanner class.

CODE:

import java.util.*;
public class days
{
    public static void main(String args[])
    {
        String a;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the month: ");
        a=s.nextLine();
        System.out.print("Enter the year: ");
        int y=s.nextInt();
        if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("October")||a.equals("December"))
        {
            System.out.println(a+" has 31 days");
        }
        else if(a.equals("February")&&(y%4==0))
        {
            System.out.println("February has 29 days");
        }
        else if(a.equals("February"))
        {
            System.out.println("February has 28 days");
        }
        else
        {
            System.out.println(a+" has 30 days");
        }
        s.close();
    };
}

OUTPUT:

PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac days.java   
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java days      
Enter the month: August
Enter the year: 2023
August has 31 days
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java>
