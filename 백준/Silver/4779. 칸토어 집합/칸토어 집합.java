import java.util.*;

public class Main {
    public static String answer(int n) {
        if (n == 0) {
            return "-";
        }
        return answer(n-1) + " ".repeat((int)Math.pow(3, n-1)) + answer(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(answer(n));  
        }   
    }
}
