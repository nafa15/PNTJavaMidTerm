package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int count = 40;
        int num1 = 0;
        int num2 = 1;
     //   System.out.print(count);

        int i = 1;
        while (i <= count) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}