import java.util.*;
public class CompString
{

    public static void main(String[] args) {

        HashSet  hs = new HashSet ();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
            System.out.println(count);
        }

    }
}
