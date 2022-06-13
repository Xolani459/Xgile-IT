import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            int x = in.nextInt();
            int y = in.nextInt();

            ExceptionHandling.division(x, y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }

    public static void division(int x, int y) {
        if (y == 0) {
            try {
                int rez = x / y;

            } catch (ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        } else {
            System.out.println(x / y);
        }
    }
}





