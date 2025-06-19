import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int[] xBox = new int[3];
        int[] yBox = new int[3];
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xBox[i] = x;
            yBox[i] = y;
        }
        int xKey = xBox[0];
        int yKey = yBox[0];
        int xAns;
        int yAns;
        if (xKey == xBox[1]) {
            xAns = xBox[2];
        } else if (xKey == xBox[2]) {
            xAns = xBox[1];
        } else {
            xAns = xBox[0];
        }

        if (yKey == yBox[1]) {
            yAns = yBox[2];
        } else if (yKey == yBox[2]) {
            yAns = yBox[1];
        } else {
            yAns = yBox[0];
        }
        System.out.printf("%d %d\n", xAns, yAns);
        
    }
}