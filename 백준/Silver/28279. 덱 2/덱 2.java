import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> tool = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.length() > 1 && command.charAt(0) == '1') {
                String[] cmdBox = command.split(" ");
                tool.offerFirst(Integer.parseInt(cmdBox[1]));
            }
            else if (command.length() > 1 && command.charAt(0) == '2') {
                String[] cmdBox = command.split(" ");
                tool.offerLast(Integer.parseInt(cmdBox[1]));
            }
            else if (command.equals("3")) {
                if (!tool.isEmpty()) {
                    //System.out.println(tool.poll());
                    sb.append(tool.poll()).append("\n");
                } else {
                    //System.out.println(-1);
                    sb.append(-1).append("\n");
                }
            }
            else if (command.equals("4")) {
                if (!tool.isEmpty()) {
                    //System.out.println(tool.pollLast());
                    sb.append(tool.pollLast()).append("\n");
                } else {
                    //System.out.println(-1);
                    sb.append(-1).append("\n");
                }
            }
            else if (command.equals("5")) {
                //System.out.println(tool.size());
                sb.append(tool.size()).append("\n");
            }
            else if (command.equals("6")) {
                if (tool.isEmpty()) {
                    //System.out.println(1);
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if (command.equals("7")) {
                if (!tool.isEmpty()) {
                    //System.out.println(tool.peek());
                    sb.append(tool.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (command.equals("8")) {
                if (!tool.isEmpty()) {
                    //System.out.println(tool.peekLast());
                    sb.append(tool.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}