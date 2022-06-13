import java.util.LinkedList;
import java.util.Iterator;
public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Thabo");
        l_list.add("Tsholo");
        l_list.add("Rose");
        l_list.add("Musa");
        l_list.add("Lesego");

        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
