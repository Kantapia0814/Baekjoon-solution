import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int r1 = 0;
        int c1 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = Integer.parseInt(sc.next());
                if (value > max) {
                    r1 = i;
                    c1 = j;
                    max = value;
                }
            }
        }
        System.out.println(max);
        System.out.println((r1 + 1) + " " + (c1 + 1));
    }
}