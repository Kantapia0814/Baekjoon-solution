import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());        
        for (int i = 0; i < K; i++) {
            Stack<Integer> tool = new Stack<>();
            String tmp = br.readLine();
            String[] tmpBox = tmp.split("");
            boolean vps = true;
            for (int j = 0; j < tmpBox.length; j++) {
                if (tmpBox[j].equals("(")) {
                    tool.push(1);
                } else if (tmpBox[j].equals(")")) {
                    if (tool.isEmpty()) {
                        vps = false;
                        break;
                    } else {
                        tool.pop();
                    }
                }
            }
            if (tool.size() == 0 && vps == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}