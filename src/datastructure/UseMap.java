package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        HashMap<Integer, String> teamPlayers = new HashMap<>();
        teamPlayers.put(11, "Drogba");
        teamPlayers.put(8, "Lampard");
        teamPlayers.put(4, "JohnTerry");
        teamPlayers.put(5, "Essien");
        teamPlayers.put(10, "Hazard");

        System.out.println(teamPlayers.get(11));
        System.out.println(teamPlayers);

        ArrayList<String> team2 = new ArrayList<>();
        team2.add("Ronaldinho");
        team2.add("Messi");
        team2.add("Xavi");
        team2.add("Iniesta");
        team2.add("Neymar");

        ArrayList<Integer> team2Numbers = new ArrayList<>();
        team2Numbers.add(10);
        team2Numbers.add(10);
        team2Numbers.add(6);
        team2Numbers.add(8);
        team2Numbers.add(11);

        HashMap<ArrayList<Integer>, ArrayList<String>> liga = new HashMap<>();
        liga.put(team2Numbers, team2);

        Iterator iterator = team2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        team2.forEach(Player -> System.out.println(Player));
        //  team2.forEach(System.out::println);

        System.out.println(liga);



    }

}
