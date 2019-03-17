package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            String s = in.nextLine();
            char[] c = new char[s.length()];
        for(char i = 0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        c[0] = Character.toUpperCase(c[0]);
        s = new String(c);
            System.out.println(s);

    }
}
