import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i = M; i <= N; i++) {
            if (i < 2) continue;
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }               
            }
            if (prime) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}