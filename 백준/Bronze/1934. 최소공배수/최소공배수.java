import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int AB = A * B;
            if (A > B) {
                while (B != 0){
                    int C = A % B;
                    A = B;
                    B = C;
                }
                System.out.println(AB / A);
            } else if (A < B) {
                while (A != 0) {
                    int C = B % A;
                    B = A;
                    A = C;
                }
                System.out.println(AB / B);
            } else {
                System.out.println(A);
            }
        }
    }
}