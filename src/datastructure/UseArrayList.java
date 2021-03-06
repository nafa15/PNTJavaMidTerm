package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> team = new ArrayList<>();

        team.add("Drogba");
        team.add("Lampard");
        team.add("JohnTerry");
        team.add("Essien");
        team.add("Hazard");

        team.remove(3);

       System.out.println(team.get(0));


        Iterator iterator = team.iterator();
        while (iterator.hasNext()){
           System.out.println(iterator.next());
        }
        team.forEach(player -> System.out.println(player));
    }

}
