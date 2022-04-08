import java.util.Scanner;
import java.lang.Math;

public class OddEven{
  public static void main(String[] args) {

    char[] operator = {'/','%'};
    Double number1, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter a number to check if is odd or even
    System.out.println("Please enter  number");
    number1 = input.nextDouble();

	
    if ((result = number1 % 2)== 0)
	{
    System.out.println("The number : " + number1 +Math.round((result)) + " is Even");
	}else if((result = number1 % 2)== 1)
	{
    System.out.println("The number is :" + number1 + Math.round((result)) + " is Odd");
	}
	else
	{
	System.out.println("The number is not a Even & Odd number!");
	}	
    input.close();
  }
}