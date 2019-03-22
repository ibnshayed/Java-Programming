package main;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 0;
        for(int i = 1; i<=t; i++){
            int n = in.nextInt();
            String s = in.next();
            StringBuilder s1 = new StringBuilder(s);
            StringBuilder s2 = s1.reverse();
            if(0 == 0){
                count++;
                System.out.println("Case "+i+": Parotum ,"+ count);
            }

            else System.out.println("Case "+i+": No Parotum");
        }

        }

    }

