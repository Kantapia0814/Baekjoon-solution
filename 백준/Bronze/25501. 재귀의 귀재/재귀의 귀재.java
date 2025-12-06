
import java.io.*;
import java.util.Scanner;

public class Main {
    static int callCount;
    public static int recursion(String s, int l, int r) {
        callCount++;
        if(l >= r) {
            return 1;
        }    
        else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else {
            return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            callCount = 0;
            String sent = sc.nextLine();
            System.out.println(isPalindrome(sent) + " " + callCount);
        }
    }
}
