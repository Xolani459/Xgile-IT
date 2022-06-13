import java.util.*;
public class Q3 {
    public static void main(String[] args) {
         HashSet<String> hash_set = new HashSet<String>();

        hash_set.add("Monday");
        hash_set.add("Tuesday");
        hash_set.add("Wednesday");
        hash_set.add("Thursday");
        hash_set.add("Friday");
        hash_set.add("Saturday");
        System.out.println("Original Hash Set: " + hash_set);

        String[] new_array = new String[hash_set.size()];
        hash_set.toArray(new_array);

        System.out.println("Array elements: ");
        for(String element : new_array){
            System.out.println(element);
        }
    }
}
