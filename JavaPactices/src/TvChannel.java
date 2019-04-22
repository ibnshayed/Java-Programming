import java.util.Scanner;

public class TvChannel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ;
        byte t = in.nextByte();
        int cost = 0;
        boolean button[] = new boolean[10];
        short q;
        int[] btn = new int[10];
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j <= 9; j++) {
                btn[j] = in.nextInt();
                if (btn[j] == 1)
                    button[j] = true;
                else button[j] = false;
            }
            q = in.nextShort();
            int c, d;
            String s;

            for (int k = 1; k <= q; k++) {
                c = in.nextInt();
                d = in.nextInt();
                s = String.valueOf(d);

            }

        }
    }
}
