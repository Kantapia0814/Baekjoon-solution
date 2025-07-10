import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); 

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
    }
}