package math.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int fab[] = new int[40];

        for (int m = 0; m < 40; m++) {
            if (m < 2) {
                fab[m] = m;
            } else {
                fab[m] = fab[m - 2] + fab[m - 1];
            }
        }
        System.out.println(fab);

        List<String> a = new ArrayList<String>();

    }
}
