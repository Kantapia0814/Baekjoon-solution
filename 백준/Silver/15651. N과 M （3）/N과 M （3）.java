import java.util.*;

public class Main {
    static int N, M;
    static int[] numBox;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        numBox = new int[M];
        visited = new boolean[N];

        dfs(0);
        System.out.println(sb);
        
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numBox[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            numBox[depth] = i + 1;
            dfs(depth + 1);
        }
    } 
}