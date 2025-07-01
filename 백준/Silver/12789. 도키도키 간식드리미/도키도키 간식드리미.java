import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        String[] strBox = str.split(" ");
        Stack<Integer> wait = new Stack<>();
        int current = 0;
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(strBox[i]);
            if (x - 1 == current) {
                current = x;
            } else {
                wait.push(x);
            }
            while (!wait.isEmpty()) {
                int y = wait.peek();
                if (current == y - 1) {
                    current = y;
                    wait.pop();
                } else {
                    break;
                }
            }
        }
        if (wait.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}