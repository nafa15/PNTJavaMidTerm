package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

       /* int i;
        int fact=1;
        int number=5;

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);*/

        int fact = 1;
        int number = 5;

        fact = factorial(number);
        System.out.println(fact);


    }
    static int factorial(int x){

        if (x == 0){
            return 1;
        }else {
            return (x*factorial(x-1));
        }

    }

}

