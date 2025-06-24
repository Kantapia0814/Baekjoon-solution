import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Member {
    int age;
    String name;
    int order;

    public Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

public class Main {    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Member[] box = new Member[num];
        for (int i = 0; i < num; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            box[i] = new Member(age, name, i);
        }
        Arrays.sort(box, new Comparator<Member>() {
            public int compare(Member m1, Member m2) {
                if (m1.age > m2.age) {
                    return 1;
                } else if (m1.age < m2.age) {
                    return -1;
                } else {
                    if (m1.order > m2.order) {
                        return 1;
                    } else if (m1.order < m2.order) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.printf("%d %s\n", box[i].age, box[i].name);
        }
    }
}