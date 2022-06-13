import java.util.Scanner;
import java.util.*;
public class Age {
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  your age?");
        age= sc.nextInt();
        Get_Age(age);
    }
    static void Get_Age(int age)
    {
        try
        {
        if (age >=18 )
        {
            throw new ArithmeticException ("arg should not be negative");
        }
        else
        {
            System.out.println("You are not welcome to the Geek Event, should be 18 years or older!!");
        }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        finally {
            System.out.println("Geek Event for Adults!");
        }
    }

}
