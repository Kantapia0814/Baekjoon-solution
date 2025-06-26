import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long AB = A*B; 
        while (B != 0) {
            long C = A % B;
            A = B;
            B = C;
        }
        System.out.println(AB / A);
    }
}

