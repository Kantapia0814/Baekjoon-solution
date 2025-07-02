import java.util.*;

public class Main {
    public static long factorial(long N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * factorial(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(factorial(N));    
    }
}