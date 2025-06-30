import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> tool = new Stack<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                int y1 = tool.pop();
                sum -= y1;
            } else {
                int y2 = tool.push(x);
                sum += y2;
            }
        }
        System.out.println(sum);
    }
}