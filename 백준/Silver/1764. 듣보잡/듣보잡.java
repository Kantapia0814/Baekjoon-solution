import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        String[] Nnames = new String[N];
        for (int i = 0; i < N; i++) {
            Nnames[i] = br.readLine();
        }
        HashSet<String> Mnames = new HashSet<>();
        for (int i = 0; i < M; i++) {
            Mnames.add(br.readLine());
        }
        int count = 0;
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (Mnames.contains(Nnames[i])) {
                answer.add(Nnames[i]);
                count++;
            }
        }
        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        sb.append(count).append('\n');
        for (String name : answer) {
            sb.append(name).append('\n');
        }
        System.out.print(sb.toString());
    }
}

