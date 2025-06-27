import java.io.*;
import java.util.*;

public class Main {    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numBox = new int[N];
        for (int i = 0; i < N; i++) {
            numBox[i] = Integer.parseInt(br.readLine());
        }
        int diff = numBox[1] - numBox[0];
        for (int i = 0; i < N - 1; i++) {
            int tmp = numBox[i+1] - numBox[i];
            diff = gcd(diff, tmp);
        }
        System.out.println(((numBox[N-1] - numBox[0]) / diff) - N + 1);
        
    }
}

