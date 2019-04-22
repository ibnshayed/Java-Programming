import java.math.BigInteger;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            long first = (long) Math.pow(a, b);
            long second = (long) Math.pow(c, d);
            if (first < second)
                System.out.println("<");
            else System.out.println(">");

        }
    }
}
