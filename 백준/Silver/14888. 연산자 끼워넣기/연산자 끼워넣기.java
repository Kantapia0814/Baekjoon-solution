import java.util.Scanner;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int N;
    static int[] n_arr;

    public static void getMaxMin(int idx, int cur, int plus, int minus, int mul, int div) {
        if (idx == N) {
            max = Math.max(max, cur);
            min = Math.min(min, cur);
            return;
        }
        int x = n_arr[idx];
        if (plus > 0) {
            getMaxMin(idx + 1, cur + x, plus - 1, minus, mul, div);
        }
        if (minus > 0) {
            getMaxMin(idx + 1, cur - x, plus, minus - 1, mul, div);
        }
        if (mul > 0) {
            getMaxMin(idx + 1, cur * x, plus, minus, mul - 1, div);
        }
        if (div > 0) {
            getMaxMin(idx + 1, cur / x, plus, minus, mul, div - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        n_arr = new int[N];
        int[] sign_arr = new int[4];
        for (int i = 0; i < N; i++) {
            n_arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            sign_arr[i] = sc.nextInt();
        }
        int plus = sign_arr[0];
        int minus = sign_arr[1];
        int mul = sign_arr[2];
        int div = sign_arr[3];

        getMaxMin(1, n_arr[0], plus, minus, mul, div);
        System.out.println(max);
        System.out.println(min);
    }
}