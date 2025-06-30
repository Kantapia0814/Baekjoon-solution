import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String tmp = br.readLine();
            String[] box = tmp.split("");
            Stack<Integer> tool = new Stack<>();
            boolean ok = true;
            if (tmp.equals(".")) {
                break;
            }
            for (int i = 0; i < box.length; i++) {
                if (box[i].equals("(")) {
                    tool.push(1);
                } else if (box[i].equals("[")) {
                    tool.push(2);
                } else if (box[i].equals(")")) {
                    if (tool.isEmpty()) {
                        ok = false;
                        break;
                    } else {
                        if (tool.peek() != 1) {
                            ok = false;
                            break;
                        } else {
                            tool.pop();
                        }
                    }
                } else if (box[i].equals("]")) {
                    if (tool.isEmpty()) {
                        ok = false;
                        break;
                    } else {
                        if (tool.peek() != 2) {
                            ok = false;
                            break;
                        } else {
                            tool.pop();
                        }
                    }
                }
            }
            if (tool.isEmpty() && ok == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
