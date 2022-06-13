import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,p=0;
    System.out.println("Enter the value for n:");
    n= sc.nextInt();
    System.out.println("Enter the value for p:");
    p= sc.nextInt();

    MyCalculator cal= new MyCalculator();
        System.out.println(cal.power(n,p));
    }
    long power(int base, int exponent) {
        checkIfInputsAreValid(base, exponent);
        return (long) Math.pow(base, exponent);
    }
    public class InvalidCalculatorInputException extends IllegalArgumentException{
        public InvalidCalculatorInputException(String message){
            super(message);
        }
    }
    private void checkIfInputsAreValid(int base, int exponent){
        if(base ==  0 && exponent == 0)
            throw new InvalidCalculatorInputException("n and p should not be zero.");
        if(base < 0 || exponent < 0)
            throw new InvalidCalculatorInputException("n or p should not be negative");
    }

}
