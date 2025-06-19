import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int goal = sc.nextInt();
        int[] numBox = new int[num];
        for (int i = 0; i < num; i++) {
            numBox[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    int sum = numBox[i] + numBox[j] + numBox[k];
                    if (sum <= goal && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
