import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //String enter = br.readLine();
        Set<String> user = new HashSet<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.equals("ENTER")) {
                user.clear();
            }
            else if (user.add(line)) {
                count++;
            }
        }
        System.out.println(count);
    }
}