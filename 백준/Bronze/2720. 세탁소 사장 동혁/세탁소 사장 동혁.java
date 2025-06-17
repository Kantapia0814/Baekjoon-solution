import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int money = sc.nextInt();
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            if (money / 25 != 0) {
                quarter = money / 25;
                money %= 25;
            } 
            if (money / 10 != 0) {
                dime = money / 10;
                money %= 10;
            } 
            if (money / 5 != 0) {
                nickel = money / 5;
                money %= 5;
            } 
            if (money / 1 != 0) {
                penny = money / 1;
            } 
            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
        }
    }
}