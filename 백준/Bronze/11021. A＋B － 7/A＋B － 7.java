import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            String str1 = sc.nextLine();
            String[] temp = str1.split(" ");
            answer[i] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Case #%d: %d\n", i+1, answer[i]);
        }
    }
}