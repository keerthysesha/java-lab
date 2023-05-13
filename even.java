Write a program to print the even numbers between 1-20.
    
AIM:
    To write a program to print the even numbers between 1-20.
        
PROCEDURE:
          STEP-1: Import the Java Scanner to get input from the user.
          STEP-2: Declare teh variables that we are about to use.
          STEP-3: Instantiate the Scanner class.
          STEP-4: Get two numbers as input from the user.
          STEP-5: Find the even numbers between 1-20 and print the output.
          Step-6: Close the object of the Scanner class.

CODE:

public class even
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Even Numbers: ");
        for(i=0;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"  ");
            }
        }
    }
}

OUTPUT:

PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac even.java
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java even      
Even Numbers: 
0  2  4  6  8  10  12  14  16  18  20  
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> 
