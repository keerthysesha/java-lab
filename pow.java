AIM:
	To write a java program to calculate power of a number raised to other.
        
PROCEDURE:
    STEP-1: Import the Java Scanner to get input from the user.
    STEP-2: Declare the variables that we are about to use.
    STEP-3: Instantiate the Scanner class.
    STEP-4: Get the numbers as input from the user.
    STEP-5: perform the operation print the output .
    Step-6: Close the object of the Scanner class.

CODE:
class pow {
    public int calc(int a,int b){
        int res;
        if(b==0){
            return 1;
        }
        else{
            res = a * (calc(a,b-1));
            return res;
        }
    }
}
import java.util.Scanner;
class power extends pow 
{
    public static  void main(String[] args){
        int a,b;
        power pow = new power();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Power of "+a+" raise to "+b+" is "+pow.calc(a,b));
        sc.close();
    }
}
OUTPUT:
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac power.java
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java power      
Enter the value for a and b:
2 4
Power of 2 raise to 4 is 16
