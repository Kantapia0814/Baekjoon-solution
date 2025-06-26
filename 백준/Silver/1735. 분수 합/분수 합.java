
import java.io.*;
import java.util.*;

public class Main {    
    public static int getAnswer(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();

        int tmp = getAnswer(Math.max(d1, d2), Math.min(d1, d2));
        int denom = (d1 * d2) / tmp;
        int sumn1n2 = (n1 * (denom / d1)) + (n2 * (denom / d2));
        int tmp2 = getAnswer(Math.max(denom, sumn1n2), Math.min(denom, sumn1n2));
        if (tmp2 != 1) {
            denom /= tmp2;
            sumn1n2 /= tmp2;
        }
        System.out.println(sumn1n2 + " " + denom);
    }
}