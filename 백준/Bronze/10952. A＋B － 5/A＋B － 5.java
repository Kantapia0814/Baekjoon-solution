import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str1 = sc.nextLine();
            String[] strBox = str1.split(" ");
            int A = Integer.parseInt(strBox[0]);
            int B = Integer.parseInt(strBox[1]);
            if (A == 0 && B == 0) {
                break;
            } else {
                System.out.println(A + B);
            }
        }
    }
}