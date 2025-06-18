import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 2;
        int count = 0;
        int[] numBox = new int[num];
        while (num != 1) {
            if (num % div != 0) {
                div++;
            } else {
                numBox[count] = div;
                count++;
                num = num / div;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(numBox[i]);
        }
    }
}