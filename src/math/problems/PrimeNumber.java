package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        for (int i = 2; i <= 1000000; i++){
            if (prime(i)){
                System.out.println(i);
            }
        }

        System.out.println();

    }

    public static boolean prime(int num){
        if (num == 2 || num == 3){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i +=2){
            if (num % i == 0 || num % Math.sqrt(num) == 0){
                return false;
            }
        }
        return true;
    }

}
