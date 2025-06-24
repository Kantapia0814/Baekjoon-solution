import java.util.*;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numBox = new int[num];
        int[] sortedBox = new int[num];

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            numBox[i] = n;
            sortedBox[i] = n;
        }
        Arrays.sort(sortedBox);

        Map<Integer, Integer> pair = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < num; i++) {
            if (!pair.containsKey(sortedBox[i])) {
                pair.put(sortedBox[i], rank++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(pair.get(numBox[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
