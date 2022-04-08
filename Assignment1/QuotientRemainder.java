import java.util.Scanner;
import java.lang.Math;

public class QuotientRemainder  {
  public static void main(String[] args) {

    char[] operator = {'/','%'};
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
	
    result = number1 / number2;
    System.out.println("The qoutient is: "+number1 + " / " + number2 + " = " + Math.round((result)));
   
    result = number1 % number2;
    System.out.println("The remainder is :"+number1 + " % " + number2 + " = " + Math.round((result)));
    input.close();
  }
}