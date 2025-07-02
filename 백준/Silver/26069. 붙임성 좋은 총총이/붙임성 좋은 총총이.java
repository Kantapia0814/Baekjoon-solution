import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> ids = new HashSet<>();
        ids.add("ChongChong");
        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            String[] cmdBox = cmd.split(" ");
            if (ids.contains(cmdBox[0])) {
                ids.add(cmdBox[1]);
            }
            else if (ids.contains(cmdBox[1])) {
                ids.add(cmdBox[0]);
            }
        }
        System.out.println(ids.size());
    }
}