import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numBox = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            sum += temp;
            numBox.add(temp);
        }
        Collections.sort(numBox);
        System.out.println(sum / 5);
        System.out.println(numBox.get(2));
    }
}