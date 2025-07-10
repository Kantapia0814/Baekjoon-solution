import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = "" + a.charAt(2) + a.charAt(1) + a.charAt(0);
        b = "" + b.charAt(2) + b.charAt(1) + b.charAt(0);
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        if (b1 > a1) {
            System.out.println(b1);
        } else {
            System.out.println(a1);
        }
    }
}