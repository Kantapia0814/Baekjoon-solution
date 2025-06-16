import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.next());
        int col = Integer.parseInt(sc.next());
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((mat1[i][j] + mat2[i][j]) + " ");
            }
        }
        System.out.println();
    }
}