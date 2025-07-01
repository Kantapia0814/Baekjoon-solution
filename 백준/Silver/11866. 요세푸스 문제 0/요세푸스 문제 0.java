import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int index = 0;
        ArrayList<Integer> tool = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            tool.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!tool.isEmpty()) {
            index = (index + K - 1) % tool.size();
            int removed = tool.remove(index);
            sb.append(removed);
            if (!tool.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
