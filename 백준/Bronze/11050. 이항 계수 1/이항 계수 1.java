import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= N; i++) {
            n *= i;
        }
        int n_r = 1;
        for (int i = 1; i <= N-K; i++) {
            n_r *= i;
        }
        int r = 1;
        for (int i = 1; i <= K; i++) {
            r *= i;
        }
        System.out.println(n / (n_r * r));

    }
}