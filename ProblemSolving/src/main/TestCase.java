package main;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double d = in.nextDouble();
        in.nextLine(); // we must have to do this for imidiate input nextLine() after nextInt();
        String s = in.nextLine();

        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Integer : " + a);

    }
}
