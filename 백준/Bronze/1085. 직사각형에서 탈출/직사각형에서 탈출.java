import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] numBox = new int[4];
        numBox[0] = Math.abs(x - w);
        numBox[1] = Math.abs(y - h);
        numBox[2] = x;
        numBox[3] = y;

        int min = numBox[0];
        for (int i = 1; i < 4; i++) {
            if (min > numBox[i]) {
                min = numBox[i];
            }
        }
        System.out.println(min);
    }
}