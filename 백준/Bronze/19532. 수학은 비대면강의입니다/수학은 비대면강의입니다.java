import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int realX = 0;
        int realY = 0;
        boolean stop = false;
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a*x) + (b*y) == c && (d*x) + (e*y) == f) {
                    realX = x;
                    realY = y;
                    stop = true;
                    break;
                }
            }
            if (stop) break;
        }   
        System.out.printf("%d %d", realX, realY);
    }
}
