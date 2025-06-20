import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        String[][] chess = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < col; j++) {
                chess[i][j] = temp[j];
            }
        }
        int min = row * col;
        for (int i = 0; i <= row-8; i++) {
            for (int j = 0; j <= col-8; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        String decision1 = ((r + c) % 2 == 0) ? "W" : "B";
                        String decision2 = ((r + c) % 2 == 0) ? "B" : "W";
                        if (!decision1.equals(chess[i+r][j+c])) count1++;
                        if (!decision2.equals(chess[i+r][j+c])) count2++;
                    }
                }
                int candidate = Math.min(count1, count2);
                min = Math.min(min, candidate);
            }
        }
        System.out.println(min);
    }
}
