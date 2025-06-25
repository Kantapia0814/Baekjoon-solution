import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> names = new HashSet<>(); 
        for (int i = 0; i < n; i++) {
            String log = sc.nextLine();
            String[] logBox = log.split(" ");
            if (logBox[1].equals("enter")) {
                names.add(logBox[0]);
            } else {
                names.remove(logBox[0]);
            }
        }
        List<String> nameList = new ArrayList<>(names);
        nameList.sort(Comparator.reverseOrder());

        for (String name : nameList) {
            System.out.println(name);
        }
    }
}