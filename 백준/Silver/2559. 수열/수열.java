import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int size = N - K + 1;
        int max = Integer.MIN_VALUE;
        int[] intBox = new int[N];
        int[] sumBox = new int[N + 1];
        for (int i = 0; i < N; i++) {
            intBox[i] = sc.nextInt();
        }
        sumBox[0] = 0;
        for (int i = 0; i < N; i++) {
            sumBox[i + 1] = sumBox[i] + intBox[i];
        }
        for (int i = 0; i < size; i++) {
            int sum = sumBox[i + K] - sumBox[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}