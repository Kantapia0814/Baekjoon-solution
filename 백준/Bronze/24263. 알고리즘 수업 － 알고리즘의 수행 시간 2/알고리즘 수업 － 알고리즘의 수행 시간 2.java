import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);  // 실행 횟수 = n
        System.out.println(1);  // 시간 복잡도 O(n) → 차수 = 1
    }
}