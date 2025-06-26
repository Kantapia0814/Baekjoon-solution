import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        HashSet<String> strBox = new HashSet<>();
        for (int i = 1; i < str1.length(); i++) {
            for (int j = 0; j < str1.length() - i + 1; j++) {
                String tmp = str1.substring(j, i+j);
                if (!strBox.contains(tmp)) {
                    strBox.add(tmp);
                }
            }
        }
        System.out.println(strBox.size() + 1);
    }
}