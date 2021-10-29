package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Silver5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testAmount = Integer.parseInt(br.readLine());

        Member[] members = new Member[testAmount];

        for (int t = 0; t < testAmount; t++) {
            st = new StringTokenizer(br.readLine());
            members[t] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < testAmount; t++) {
            sb.append(members[t]).append('\n');
        }
        System.out.print(sb);
    }

    public static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return (age + " " + name);
        }
    }
}
