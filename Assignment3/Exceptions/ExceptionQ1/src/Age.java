import java.util.Scanner;
public class Age{

    public static void main(String[] args) {
       int age;

       Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your age?");
        age= sc.nextInt();
        Validate_Age(age);
    }
    static void Validate_Age(int age)
    {
        try {
            if (age < 18) {
                throw new ArithmeticException("Not eigable to vote and drive");
            }
            else
            {
                System.out.println("Able to register to vote and you allowed to take your drivers licence!");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("Remember to Register to vote for the up comming elections in August!!");
        }
    }
}