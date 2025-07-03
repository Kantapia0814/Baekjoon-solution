import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str1 = br.readLine();
            if (str1.equals("0 0 0")) break;
            String[] strBox = str1.split(" ");
            int[] numBox = new int[3];
            int max = 0;
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                int x = Integer.parseInt(strBox[i]);
                numBox[i] = x;
                sum += x;
                if (x > max) {
                    max = x;
                }
            }
            if (max >= sum - max) {
                sb.append("Invalid").append("\n");
            }
            else if (numBox[0] == numBox[1] && numBox[1] == numBox[2]) {
                sb.append("Equilateral").append("\n");
            }
            else if (numBox[0] == numBox[1] || numBox[1] == numBox[2] || numBox[0] == numBox[2]) {
                sb.append("Isosceles").append("\n");
            }
            else if (numBox[0] != numBox[1] && numBox[1] != numBox[2] && numBox[1] != numBox[2]) {
                sb.append("Scalene").append("\n");
            }
        }
        System.out.println(sb);
        
    }
}
