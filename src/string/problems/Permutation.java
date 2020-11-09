package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String word = "ALG";
        int len = word.length();

        permute(word, 0, len);

    }

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void permute(String word, int s, int n) {
        if (s == n - 1) {
            System.out.println(word);
        } else {
            for (int i = s; i < n; i++) {
                word = swapString(word, s, i);

                permute(word, s + 1, n);


            }
        }
    }

}
