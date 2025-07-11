import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] answer = new int[n];
        int[] numBox = new int[2*n];
        for (int i = 0; i < n; i++) {
            String str1 = sc.nextLine();
            String[] temp = str1.split(" ");
            numBox[2*i] = Integer.parseInt(temp[0]);
            numBox[2*i+1] = Integer.parseInt(temp[1]);
            answer[i] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, numBox[2*i], numBox[2*i+1], answer[i]);
        }
    }
}