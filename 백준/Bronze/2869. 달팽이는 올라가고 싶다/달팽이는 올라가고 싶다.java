import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        System.out.println((V-B-1)/(A-B) + 1);
    }
}