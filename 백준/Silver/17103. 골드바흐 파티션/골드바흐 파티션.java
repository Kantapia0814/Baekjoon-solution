import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] box = new int[T];
        int maxN = 0;
        for (int i = 0; i < T; i++) {
            box[i] = Integer.parseInt(br.readLine());
            if (box[i] > maxN) {
                maxN = box[i];
            }
        }
        boolean[] prime = new boolean[maxN+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= maxN; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= maxN; j+=i) {
                    prime[j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = box[i];
            int count = 0;
            for (int j = 2; j <= N/2; j++) {
                if (prime[j] && prime[N-j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
