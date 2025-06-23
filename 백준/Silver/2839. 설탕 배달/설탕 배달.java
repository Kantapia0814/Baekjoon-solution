import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count3 = 0;
        int count5 = 0;
        int min = num;
        while (num >= (5 * count5)) {
            if ((num - (5 * count5)) % 3 == 0) {
                count3 = (num - (5 * count5)) / 3;
                int temp = count3 + count5;
                if (temp < min) min = temp;
            }
            count5++;
        }
        if (min == num) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}