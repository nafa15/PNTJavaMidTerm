package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int m = array1.length;
        int n = array2.length;

        System.out.println(lowDiff(array1, array2, m, n));

    }

    static int lowDiff(int[] array1, int[] array2, int m, int n){

        Arrays.sort(array1);
        Arrays.sort(array2);

        int x = 0, y = 0;

        int result = Integer.MAX_VALUE;

        while (x<m && y<n){
            if (Math.abs(array1[x]-array2[y]) < result)
                result = Math.abs(array1[x] - array2[y]);

            if (array1[x] < array2[y])
                x++;
            else
                y++;
        }
        return result;

    }

}
