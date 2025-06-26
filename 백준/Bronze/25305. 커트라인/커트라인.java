import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Nandk = br.readLine().split(" ");
        int N = Integer.parseInt(Nandk[0]);
        int k = Integer.parseInt(Nandk[1]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            scores.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println(scores.get(k-1));
    }
}