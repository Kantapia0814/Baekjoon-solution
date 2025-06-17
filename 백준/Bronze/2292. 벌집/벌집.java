import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int room = 1;
        int max = 1;

        while (num > max) {
            max += 6 * room;
            room++;
        }
        System.out.println(room);
    }
}