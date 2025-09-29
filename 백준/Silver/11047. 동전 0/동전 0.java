import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        sc.nextLine();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            String x = sc.nextLine();
            coins[i] = Integer.parseInt(x);
        }
        int j = N - 1;  
        while (K > 0) {
            if (coins[j] > K) {
                j--;
            } else {
                K = K - coins[j];
                count++;
            }
        }
        System.out.println(count);
    }
}
