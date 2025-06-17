import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String[][] lst1 = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String str1 = sc.nextLine();
            for (int j = 0; j < str1.length(); j++) {
                lst1[i][j] = String.valueOf(str1.charAt(j));
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (lst1[i][j] != null) {
                    System.out.print(lst1[i][j]);
                }
            }
        }
    }
}