package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> line = new LinkedList<>();

        line.add("Drogba");
        line.add("Lampard");
        line.add("JohnTerry");
        line.add("Essien");
        line.add("Hazard");


        System.out.println(line);


        System.out.println("head: " + line.peek());     // Head

        System.out.println("Size: " + line.size());     // Size

        String rem = line.remove();
        System.out.println(rem);                        // Removed one

        System.out.println(line.poll());                // Retrieves and removes the head

        Iterator<String> iterator = line.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
