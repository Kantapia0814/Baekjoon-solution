import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean paper[][] = new boolean[100][100];
        for (int i = 0; i < number; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == true) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
