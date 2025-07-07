import java.util.*;

public class Main {
    static int[] Mbox;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        HashSet<Integer> Nbox = new HashSet<>(); 
        for (int i = 0; i < N; i++) {
            Nbox.add(sc.nextInt());
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int m = sc.nextInt();
            if (Nbox.contains(m)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}