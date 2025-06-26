import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        int max = 0;
        while (true) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                break;
            }
            numbers.add(tmp);
            if (tmp > max) {
                max = tmp;
            } 
        }
        boolean[] filter = new boolean[(2*max)+1];
        Arrays.fill(filter, true);
        filter[0] = false;
        filter[1] = false;
        for (int i = 2; i * i < (2*max)+1; i++) {
            if (filter[i]) {
                for (int j = i * i; j < 2*max+1; j+=i) {
                    filter[j] = false;
                }
            }
        }
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            int tmp = numbers.get(i);
            int count = 0;
            for (int j = tmp + 1; j <= tmp * 2; j++) {
                if (filter[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(answer[i]);
        }
    }
}
