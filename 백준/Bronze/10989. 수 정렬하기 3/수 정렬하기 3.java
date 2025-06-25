import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numBox = new int[N];
        for (int i = 0; i < N; i++) {
            numBox[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numBox);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(numBox[i]).append("\n");
        }

        System.out.print(sb); 
    }
}