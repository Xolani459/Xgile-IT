import java.util.*;
import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {
        Minimum ob = new Minimum();
        Scanner sc= new Scanner(System.in);
        int x=0;
        x=sc.nextInt();
        System.out.println("Enter size of the array: ");
        int [] b=new int[x];
        ob.min(b);
    }
    public int  min(int [] b) {
        try {
            int min= b[0];
            for (int k= 0; k < b.length; k= k+1) {
                if (b[k] > min) min= b[k];
            }
            return min;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("min of 0 values doesn’t exist");
        }
    }
}


