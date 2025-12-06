import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    
    public static void hanoi(int n, int start, int middle, int end) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            count++;
            return;
        }
        
        hanoi(n - 1, start, end, middle);
        sb.append(start).append(" ").append(end).append("\n");
        count++;
        hanoi(n - 1, middle, start, end);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        hanoi(N, 1, 2, 3);
        
        System.out.println(count);
        System.out.print(sb);
    }
}