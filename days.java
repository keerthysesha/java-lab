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

