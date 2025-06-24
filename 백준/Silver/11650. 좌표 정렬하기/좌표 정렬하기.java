import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] box = new String[num];
        for (int i = 0; i < num; i++) {
            box[i] = sc.nextLine();
        }
        Arrays.sort(box, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] n1 = s1.split(" ");
                String[] n2 = s2.split(" ");
                int x1 = Integer.parseInt(n1[0]);
                int y1 = Integer.parseInt(n1[1]);
                int x2 = Integer.parseInt(n2[0]);
                int y2 = Integer.parseInt(n2[1]);
                if (x1 > x2) {
                    return 1;
                } else if (x1 < x2) {
                    return -1;
                } else {
                    if (y1 > y2) {
                        return 1;
                    } else if (y1 < y2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        for (int i = 0; i < num; i++) {
            System.out.println(box[i]);
        }
    }
}
