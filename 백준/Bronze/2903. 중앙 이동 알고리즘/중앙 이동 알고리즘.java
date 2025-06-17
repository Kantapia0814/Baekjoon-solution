import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = (int)Math.pow(2, num) + 1;
        System.out.println((int) Math.pow(num2, 2));
    }
}
