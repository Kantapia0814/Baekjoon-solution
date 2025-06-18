import java.util.Scanner;

public class Main {    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        int count = 0;
        int[] numList = new int[num];
        String[] lst1 = numbers.split(" ");
        for (int i = 0; i < num; i++) {
            numList[i] = Integer.parseInt(lst1[i]);
        }
            
        for (int i = 0; i < num; i++) {
            int X = numList[i];
            if (X < 2) continue;
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(X); j++) {
                if (X % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
