import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NandM = br.readLine();
        String[] cmd1 = NandM.split(" ");
        int N = Integer.parseInt(cmd1[0]);
        int M = Integer.parseInt(cmd1[1]);
        String str1 = br.readLine();
        String[] box1 = str1.split(" ");
        int[] numBox = new int[N];
        for (int i = 0; i < N; i++) {
            numBox[i] = Integer.parseInt(box1[i]);
        }
        long[] modCount = new long[M];
        long sum = 0;
        long answer = 0;

        modCount[0] = 1;

        for (int i = 0; i < N; i++) {
            sum += numBox[i];
            int mod = (int)(sum % M);
            answer += modCount[mod];
            modCount[mod]++;
        }
        System.out.println(answer);
    }
}