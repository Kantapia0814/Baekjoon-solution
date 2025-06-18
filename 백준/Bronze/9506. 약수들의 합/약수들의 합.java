import java.util.Scanner;

public class Main {    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            int sum = 0;
            int index = 0;
            int[] numBox = new int[num];
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    numBox[index] = i;
                    sum += i;
                    index++;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (sum == num) {
                sb.append(num + " = " + numBox[0]);
                for (int i = 1; i < index; i++) {
                    sb.append(" + " + numBox[i]);
                }
                System.out.println(sb.toString());
            } else {
                sb.append(num + " is NOT perfect.");
                System.out.println(sb.toString());
            }
        }
    }
}