import java.util.Scanner;

public class Main {    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int index = sc.nextInt() - 1;
        int answer = 0;
        int[] numBox = new int[num1];
        int boxIndex = 0;
        for (int i = 1; i < num1+1; i++) {
            if (num1 % i == 0) {
                numBox[boxIndex] = i;
                boxIndex++;
            }
        }
        if (index > boxIndex) {
            System.out.println(answer);
        } else {
            answer = numBox[index];
            System.out.println(answer);
        }
    }
}