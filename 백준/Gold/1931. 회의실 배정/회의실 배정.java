
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] schedule = new int[N][2];
        for (int i = 0; i < N; i++) {
            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();
        }
        // 끝나는 시간으로 정렬, 같으면 시작 시간으로 정렬
        Arrays.sort(schedule, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];  // 끝나는 시간이 같으면 시작 시간으로 정렬
            }
            return a[1] - b[1];  // 끝나는 시간으로 정렬
        });

        int count = 1;  
        int end = schedule[0][1];
        for (int i = 1; i < N; i++) {
            if (schedule[i][0] >= end) {  // 겹치지 않는 경우
                end = schedule[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
