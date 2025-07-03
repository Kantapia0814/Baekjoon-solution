import java.util.*;

public class Main {
    static String[][] arr;

    public static void fillBlank(int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                arr[i][j] = " ";
            }
        }
    }

    public static void answer(int x, int y, int size) {
        if (size == 1) {
            arr[x][y] = "*";
            return;
        }
        int realSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    fillBlank(x + realSize, y + realSize, realSize);
                } else {
                    answer(x + i * realSize, y + j * realSize, realSize);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        arr = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = " ";
            }
        }    
        answer(0, 0, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
