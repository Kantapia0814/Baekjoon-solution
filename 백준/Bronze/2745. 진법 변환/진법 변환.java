import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int answer = 0;
        
        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int digit;
            if (Character.isDigit(ch)) {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }
            answer += Math.pow(B, N.length() - i - 1) * digit;
        }
        System.out.println(answer);
    }
}
