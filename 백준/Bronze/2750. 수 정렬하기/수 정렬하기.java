import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> numBox = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numBox.add(sc.nextInt());
        }
        Collections.sort(numBox);
        for (int i = 0; i < numBox.size(); i++) {
            System.out.println(numBox.get(i));
        }
    }
}