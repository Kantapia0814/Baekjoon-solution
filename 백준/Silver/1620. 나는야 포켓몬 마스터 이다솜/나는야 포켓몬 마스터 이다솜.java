import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String cmd = br.readLine();
        String[] cmdBox = cmd.split(" ");
        int N = Integer.parseInt(cmdBox[0]);
        int index = 1;
        int M = Integer.parseInt(cmdBox[1]);
        HashMap<String, Integer> pokemon1 = new HashMap<>();
        HashMap<Integer, String> pokemon2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str1 = br.readLine();
            pokemon1.put(str1, index);
            pokemon2.put(index, str1);
            index++;
        }
        for (int i = 0; i < M; i++) {
            String str2 = br.readLine();
            if (Character.isDigit(str2.charAt(0))) {
                sb.append(pokemon2.get(Integer.parseInt(str2))).append("\n");
            } else {
                sb.append(pokemon1.get(str2)).append("\n");
            }
        }
        System.out.println(sb);
    }
}