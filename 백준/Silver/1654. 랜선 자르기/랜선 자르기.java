import java.io.*;
import java.util.*;

public class Main {
    static int[] Mbox;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String[] strBox = str1.split(" ");
        int K = Integer.parseInt(strBox[0]);
        int N = Integer.parseInt(strBox[1]);
        int[] Kbox = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            int x = Integer.parseInt(br.readLine());
            Kbox[i] = x;
            if (max < x) {
                max = x;
            }
        }

        long left = 1;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int i = 0; i < K; i++) {
                count += Kbox[i] / mid;
            }
            if (count >= N) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}