import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        String[] Nbox1 = br.readLine().split(" ");
        HashSet<Integer> Nbox2 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            Nbox2.add(Integer.parseInt(Nbox1[i]));
        }
        String[] Mbox1 = br.readLine().split(" ");
        HashSet<Integer> Mbox2 = new HashSet<>();
        for (int i = 0; i < M; i++) {
            Mbox2.add(Integer.parseInt(Mbox1[i]));
        }
        int count1 = 0;
        for (int i = 0; i < N; i++) {
            if (Mbox2.contains(Integer.parseInt(Nbox1[i]))) {
                count1++;
            }
        }
        int count2 = 0;
        for (int i = 0; i < M; i++) {
            if (Nbox2.contains(Integer.parseInt(Mbox1[i]))) {
                count2++;
            }
        }
        System.out.println((M - count1) + (N - count2));
    }
}