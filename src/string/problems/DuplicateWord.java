package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] splittedData = st.split(" ");

        int count = splittedData.length;

        int sum = st.length();

        double average = sum / count ;



        HashMap<String, Integer> appearance = new HashMap<>();

        for (int n = 0; n < splittedData.length; n++) {
            Integer prevCount = appearance.get(splittedData[n]);
            if (prevCount == null) {
                prevCount = 0;
            }
            appearance.put(splittedData[n], prevCount + 1);
        }
        System.out.println(appearance);

        System.out.println("The average length of the words is: "+average);

    }

}
