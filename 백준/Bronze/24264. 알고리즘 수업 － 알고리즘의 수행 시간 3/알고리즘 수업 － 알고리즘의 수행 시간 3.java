import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  // 꼭 long으로 받아야 함
        System.out.println(n * n);  // 수행 횟수
        System.out.println(2);      // 최고차항 차수
    }
}
