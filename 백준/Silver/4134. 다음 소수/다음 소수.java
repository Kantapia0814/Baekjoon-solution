
import java.io.*;
import java.util.*;

public class Main {
    static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        long r = (long)Math.sqrt(x);
        for (long i = 3; i <= r; i += 2)
            if (x % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());
            if (n <= 2) {
                bw.write("2\n");
                continue;
            }
            if (n % 2 == 0) n++;
            while (!isPrime(n)) {
                n += 2;
            }
            bw.write(n + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
