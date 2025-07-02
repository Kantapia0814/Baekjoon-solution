import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> cmdBox = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cmdBox.add(sc.nextInt());
        }
        ArrayList<Integer> mainBox = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            mainBox.add(i);
        }
        int x = 0;
        int size = N;
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = mainBox.get(x);
            mainBox.remove(x);
            int cmd = cmdBox.get(x).intValue();
            cmdBox.remove(x);
            size--;
            if (size == 0) {
                break;
            }
            if (cmd > 0) {
                x = (x + (cmd - 1)) % size;
            } 
            else if (cmd < 0) {
                x = (x + cmd) % size;
                if (x < 0) {
                    x += size;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
