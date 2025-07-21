import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] box = new int[26][str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            int ch = str1.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                if (i == 0) {
                    if (j == ch) {
                        box[j][i] = 1;
                    } else {
                        box[j][i] = 0;
                    }
                } else {
                    box[j][i] = box[j][i-1];
                    if (j == ch) {
                        box[j][i]++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            String str2 = br.readLine();
            String[] strBox = str2.split(" ");
            int ch = strBox[0].charAt(0) - 'a';
            int l = Integer.parseInt(strBox[1]);
            int s = Integer.parseInt(strBox[2]);
            int answer;
            if (l == 0) {
                answer = box[ch][s];
            } else {
                answer = box[ch][s] - box[ch][l - 1];
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}