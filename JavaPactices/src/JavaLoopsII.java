/*We use the integers , , and  to create the following series:

        You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

        Input Format

        The first line contains an integer, , denoting the number of queries.
        Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

        Constraints

        Output Format

        For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.*/

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            for (int j = 0; j < n; j++) {

                if (j > 0) {
                    result += (int) Math.pow(2, j) * b;
                } else result = a + (int) Math.pow(2, j) * b;

                System.out.print(result + " ");

            }
            System.out.println();
        }
    }
}
