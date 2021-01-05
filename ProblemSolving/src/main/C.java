package main;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        //squre free number nth
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(squareFree(n));


    }

    public static int squareFree(int n) {
        int cnt = 0;

        for (int i = 1; ; i++) {

            boolean isSqFree = true;

            for (int j = 2; j * j <= i; j++) {

                if (i % (j * j) == 0) {
                    isSqFree = false;
                    break;
                }
            }

            if (isSqFree == true) {
                cnt++;

                if (cnt == n)
                    return i;
            }
        }
    }
}
