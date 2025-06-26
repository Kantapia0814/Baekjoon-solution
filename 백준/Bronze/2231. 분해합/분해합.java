import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i < num; i++) {
            int tmp = i;
            int sum = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp = tmp / 10;
            }
            if (sum == num) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}