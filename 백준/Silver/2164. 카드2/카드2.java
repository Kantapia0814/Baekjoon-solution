import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> tool = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            tool.offer(i+1);
        }
        while(tool.size() > 1) {
            tool.pollFirst();
            if (tool.size() == 1) {
                break;
            } else {
                tool.offerLast(tool.pollFirst());
            }
        }
        System.out.println(tool.peek());
    }
}
