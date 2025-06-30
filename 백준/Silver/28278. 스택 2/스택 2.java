import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> tool = new Stack<>();
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            if (tmp.length() > 1) {
                String[] box = tmp.split(" ");
                tool.push(Integer.parseInt(box[1]));
            }
            else if (tmp.equals("2")) {
                if (!tool.isEmpty()) {
                    System.out.println(tool.pop());
                } else {
                    System.out.println(-1);
                }
            }
            else if (tmp.equals("3")) {
                System.out.println(tool.size());
            }
            else if (tmp.equals("4")) {
                if (tool.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if (tmp.equals("5")) {
                if (!tool.isEmpty()) {
                    int x = tool.peek();
                    System.out.println(x);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
