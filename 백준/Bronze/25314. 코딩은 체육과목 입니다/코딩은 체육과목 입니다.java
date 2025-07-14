import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = N / 4; 
        String answer = "";
        for (int i = 0; i < x; i++) {
            answer += "long ";
        }
        answer += "int";
        System.out.println(answer);
    }
}