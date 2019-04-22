import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte n = in.nextByte();
        short a = in.nextShort();
        short b = in.nextShort();
        short s = in.nextShort();

        short newn = (short) (n - 2);

        int temp1 = newn * b;
        int temp2 = s - (a + b);

        if (temp1 >= temp2)
            System.out.println("YES");
        else System.out.println("NO");


    }
}
