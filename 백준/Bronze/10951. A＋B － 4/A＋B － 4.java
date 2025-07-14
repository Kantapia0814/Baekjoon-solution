import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str1;
        while ((str1 = br.readLine()) != null) {
            if (str1.trim().isEmpty()) continue;
            String[] strBox = str1.split(" ");
            int A = Integer.parseInt(strBox[0]);
            int B = Integer.parseInt(strBox[1]);
            sb.append(A + B).append("\n");
        }
        System.out.println(sb);
    }
}