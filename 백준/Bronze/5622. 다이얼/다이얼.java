import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            String cmd = String.valueOf(str1.charAt(i));
            if (cmd.equals("A") || cmd.equals("B") || cmd.equals("C")) {
                sum += 3;
            }
            else if (cmd.equals("D") || cmd.equals("E") || cmd.equals("F")) {
                sum += 4;
            }
            else if (cmd.equals("G") || cmd.equals("H") || cmd.equals("I")) {
                sum += 5;
            }
            else if (cmd.equals("J") || cmd.equals("K") || cmd.equals("L")) {
                sum += 6;
            }
            else if (cmd.equals("M") || cmd.equals("N") || cmd.equals("O")) {
                sum += 7;
            }
            else if (cmd.equals("P") || cmd.equals("Q") || cmd.equals("R") || cmd.equals("S")) {
                sum += 8;
            }
            else if (cmd.equals("T") || cmd.equals("U") || cmd.equals("V")) {
                sum += 9;
            }
            else if (cmd.equals("W") || cmd.equals("X") || cmd.equals("Y") || cmd.equals("Z")) {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}