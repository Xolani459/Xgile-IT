import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Scanner;
import java.util.*;
public class MyException {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int age;
        System.out.println("enter age :");
        age= sc.nextInt();

    }
    static  void input_Age(int age)
    {
    try {
        if (age == 10)
        {
           throw new Exception("a");
        }else if(age ==10)
        {
            throw new Exception("MyException[117]");
        }
    }
    catch(ArithmeticException e){
        System.out.println("Invalid division");
    }
    catch (NumberFormatException e)
    {
               System.out.println("Format mismatch");
    }
    catch (StringIndexOutOfBoundsException e)
    {
        System.out.println("Index is invalid");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is invalid");
    }
    catch(Exception e){
        System.out.println("Exception Encountered");
    }
    finally {
        System.out.println("Exception Handling Completed");
    }
    }
}
