import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        String start = "666";
        while (true) {
            boolean found = false;
            for (int i = 0; i <= start.length()-3; i++) {
                if (start.charAt(i) == '6' && start.charAt(i+1) == '6' && start.charAt(i+2) == '6') {
                    count++;
                    found = true;
                    break;
                }
            }
            if (count == num) {
                break;
            }
            int temp = Integer.parseInt(start);
            temp++;
            start = String.valueOf(temp);
        }
        System.out.println(start);       
    }
}
