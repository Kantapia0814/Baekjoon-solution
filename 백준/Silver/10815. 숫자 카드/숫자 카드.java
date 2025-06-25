import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Set<Integer> Nset = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Nset.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] M = new int[m];
        for (int i = 0; i < m; i++) {
            M[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (Nset.contains(M[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}