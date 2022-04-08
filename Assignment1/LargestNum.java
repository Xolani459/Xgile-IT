import java.util.Scanner;
import java.lang.Math;

public class LargestNum  {
  public static void main(String[] args) {

    Double number1, number2,number3, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask user to enter the three numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

     System.out.println("Enter second number");
    number2 = input.nextDouble();
	
	 System.out.println("Enter second number");
    number3 = input.nextDouble();
	
	if (number1 > number2 && number1 > number3)
	{
		System.out.println("The largest number is :" + Math.round(number1));
	}else if (number2 > number1 && number2 > number3)
	{
			System.out.println("The largest number is :" + Math.round(number2));
	
	}
	else if (number3 > number1 && number3 > number2)
	{
			System.out.println("The largest number is :" + Math.round(number3));
	}
    input.close();
  }
}