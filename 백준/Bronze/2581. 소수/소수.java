import java.util.Scanner;

public class Main {    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt() + 1;
        int count = 0;
        int[] numBox = new int[last - first];
        for (int i = first; i < last; i++) {
            if (i < 2) continue;
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                numBox[count] = i;
                count++; 
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            int answer1 = 0;
            for (int i = 0; i < count; i++) {
                answer1 += numBox[i];
            }
            System.out.println(answer1);
            System.out.println(numBox[0]);
        }        
    }
}