import java.util.*;

public class Main {
    static int N;
    static int answer;
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        col = new boolean[N];
        diag1 = new boolean[2*N-1];
        diag2 = new boolean[2*N-1];

        dfs(0);
        System.out.println(answer);
    }

    static void dfs(int row) {
        if (row == N) {
            answer++;
            return;
        }

        for (int c=0; c<N; c++) {
            if (col[c] || diag1[row+c] || diag2[row-c+N-1]) continue;

            col[c] = diag1[row+c] = diag2[row-c+N-1] = true;
            dfs(row+1);
            col[c] = diag1[row+c] = diag2[row-c+N-1] = false;
        }
    }
}