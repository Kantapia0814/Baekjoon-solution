import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> tool = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String str1 = br.readLine();
            if (str1.charAt(0) == 'p' && str1.charAt(1) == 'u') {
                String[] strBox = str1.split(" ");
                tool.offer(Integer.parseInt(strBox[1]));
            } 
            else if (str1.equals("pop")) {
                if (!tool.isEmpty()) {
                    sb.append(tool.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } 
            else if (str1.equals("size")) {
                sb.append(tool.size()).append("\n");
            } 
            else if (str1.equals("empty")) {
                if (tool.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (str1.equals("front")) {
                if (!tool.isEmpty()) {
                    sb.append(tool.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (str1.equals("back")) {
                if (!tool.isEmpty()) {
                    sb.append(tool.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
