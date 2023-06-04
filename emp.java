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