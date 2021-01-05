import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();

        int towDAraay[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                towDAraay[i][j] = in.nextInt();
            }
        }
        System.out.println("Original:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(towDAraay[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(towDAraay[j][i] + " ");
            }
            System.out.println();
        }

    }
}
