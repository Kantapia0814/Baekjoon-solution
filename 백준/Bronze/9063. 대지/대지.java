import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> xBox = new ArrayList<>();
        ArrayList<Integer> yBox = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xBox.add(x);
            yBox.add(y);
        }    
        int width = Collections.max(xBox) - Collections.min(xBox);
        int height = Collections.max(yBox) - Collections.min(yBox);
        System.out.println(width * height);
    }
}