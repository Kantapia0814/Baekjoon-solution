import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NandM = sc.nextLine().split(" ");
        int N = Integer.parseInt(NandM[0]);
        int M = Integer.parseInt(NandM[1]);
        int[] intBox = new int[N];
        int[] sumBox = new int[N + 1];
        for (int i = 0; i < N; i++) {
            intBox[i] = sc.nextInt();
            sumBox[i + 1] = sumBox[i] + intBox[i];
        }
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] index = sc.nextLine().split(" ");
            int a = Integer.parseInt(index[0]);
            int b = Integer.parseInt(index[1]);
            int answer = sumBox[b] - sumBox[a - 1];
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}