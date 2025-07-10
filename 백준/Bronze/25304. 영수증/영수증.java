import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String str1 = sc.nextLine();
            String[] strBox = str1.split(" ");
            int line = Integer.parseInt(strBox[0]) * Integer.parseInt(strBox[1]);
            sum += line;
        }
        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}