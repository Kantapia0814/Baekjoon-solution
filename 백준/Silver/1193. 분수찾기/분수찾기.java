import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 1;
        while (x > num) {
            x -= num;
            num++;
        }
        int denominator = 0;
        int numerator = 0;
        if (num % 2 == 1) {
            numerator = num - x + 1;
            denominator = x;
        } else {
            numerator = x;
            denominator = num - x + 1;
        }
        System.out.printf("%d/%d\n", numerator, denominator);
    }
}
