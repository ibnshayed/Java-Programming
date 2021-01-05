package main;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        //Mastering programming laguage java

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 1; i <= testCase; i++) {
            String s1 = in.next();
            String s2 = in.next();
            s1 = s1.replace(".", "");
            s2 = s2.replace(".", "");
            long a = Long.parseLong(s1);
            long b = Long.parseLong(s2);
            System.out.println(a * b);

        }

    }
}
