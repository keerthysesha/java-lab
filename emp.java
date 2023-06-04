AIM:
	To write a java program to print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 
        
PROCEDURE:
    STEP-1: Import the Java Scanner to get input from the user.
    STEP-2: Declare the variables that we are about to use.
    STEP-3: Instantiate the Scanner class.
    STEP-4: Get the details of employees as input from the user.
    STEP-5: print the employee information.
    Step-6: Close the object of the Scanner class.

CODE:
public class emp1
{
    public String empName(String name)
    {
        return name;
    }
    public int yearOfJoin(int year)
    {
        return year;
    }
    public int empSalary(int sal)
    {
        return sal;
    }
    public String empAddress(String addr)
    {
        return addr;
    }
}
import java.util.Scanner;
public class emp extends emp1
 {
    public static void main(String[] args) {

        emp emp1 = new emp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the employee:");
        String name = sc.nextLine();
        emp1.empName(name);

        System.out.println("Enter the Year of Joining:");
        int year = sc.nextInt();
        emp1.yearOfJoin(year);

        System.out.println("Enter the Salary of the employee:");
        int sal = sc.nextInt();
        emp1.empSalary(sal);

        System.out.println("Enter the Address of the employee:");
        String addr = sc.next();
        emp1.empAddress(addr); 

        System.out.println("Name\t\tYearOfJoining\tSalary\tAddress");
        System.out.println(name+"\t\t"+year+"\t\t"+sal+"\t"+addr);

        sc.close();

    }
}

OUTPUT:
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> javac emp.java
PS C:\Users\Keerthy Seshasayanam\OneDrive\Desktop\java> java emp      
Enter the Name of the employee:
Robert
Sam
John
Enter the Year of Joining:
1994
2000
1999
Enter the Address of the employee:
64C-WallsStreat
68D-WallsStreat
26B-WallsStreat
Name            YearOfJoining   Address
Robert          1994            64C-WallsStreat
Sam             2000            68D- WallsStreat
John            1999            26B- WallsStreat
