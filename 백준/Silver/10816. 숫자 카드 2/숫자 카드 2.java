import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] Nbox = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Nbox[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        List<Integer> Mlist = new ArrayList<>();
        Map<Integer, Integer> Mmap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            Mlist.add(num);
            Mmap.put(num, 0);
        }

        for (int i = 0; i < N; i++) {
            if (Mmap.containsKey(Nbox[i])) {
                Mmap.put(Nbox[i], Mmap.get(Nbox[i]) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : Mlist) {
            sb.append(Mmap.get(num)).append(" ");
        }
        System.out.print(sb.toString());
    }
}