import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String[] tmp = sc.nextLine().split(" ");
            int R = Integer.parseInt(tmp[0]);
            String P = tmp[1];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < P.length(); j++) {
                char ch = P.charAt(j);
                for (int k = 0; k < R; k++) {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}