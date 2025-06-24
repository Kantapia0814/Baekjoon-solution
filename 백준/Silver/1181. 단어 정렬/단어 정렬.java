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
                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() < s2.length()) {
                    return -1;
                } else {
                    if (s1.compareTo(s2) > 0) {
                        return 1;
                    } else if (s1.compareTo(s2) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        String prev = "";
        for (int i = 0; i < num; i++) {
            if (!box[i].equals(prev)) {
                System.out.println(box[i]);
                prev = box[i];
            }
        }
    }
}