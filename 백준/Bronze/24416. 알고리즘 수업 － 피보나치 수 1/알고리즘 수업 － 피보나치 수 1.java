import java.util.*;

public class Main {
    static int N;
    static int[] dp;
    static int count1 = 0;
    static int count2 = 0;

    static int fib1(int n) {
        count1++;
        if (n <= 1) return n;
        return fib1(n-1) + fib1(n-2);
    }
    static int fib2(int n) {
        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i - 2];
            count2++;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int a = fib1(N);
        fib2(N);
        System.out.printf("%d %d", a, count2-1);
    }
}