import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        
        while (N > 0) {
            int num = N % B;
            char ch;
            if (num >= 10) {
                ch = (char)(num - 10 + 'A');
            } else {
                ch = (char)(num + '0');
            }
            answer.insert(0, ch);
            N /= B;
        }
        System.out.println(answer.toString());
    }
}