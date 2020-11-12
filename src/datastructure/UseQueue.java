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

        Queue<String> team = new LinkedList<>();

        team.add("Drogba");
        team.add("Lampard");
        team.add("JohnTerry");
        team.add("Essien");
        team.add("Hazard");


        System.out.println(team);


        System.out.println("head: " + team.peek());     // Head

        System.out.println("Size: " + team.size());     // Size

        String rem = team.remove();
        System.out.println(rem);                        // Removed one

        System.out.println(team.poll());                // Retrieves and removes the head

        Iterator<String> iterator = team.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
