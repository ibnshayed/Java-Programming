import java.util.Scanner;

public class Fan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int f, s1, s2, q;
        for (int i = 1; i <= t; i++) {
            f = in.nextInt();
            s1 = in.nextInt();
            s2 = in.nextInt();
            q = in.nextInt();
            for (int j = 1; j <= q; j++) {
                s1 = in.nextInt();
                s2 = in.nextInt();
                if ((s1 == 0 && s2 == 0) || (s1 == 1 && s2 == 1)) {
                    System.out.println("ON");
                } else System.out.println("OFF");
            }
        }
    }
}
