package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Silver4_23056 {

    static class Student {
        final int id;
        final String name;
        final char team;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
            this.team = id % 2 == 1 ? 'B' : 'W';
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Student> students = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] participantsPerClass = new int[N + 1];

        while (true) {
            String input = br.readLine();

            if (input.equals("0 0")) break;

            st = new StringTokenizer(input);
            int id = Integer.parseInt(st.nextToken());

            if (participantsPerClass[id] >= M) continue;

            participantsPerClass[id]++;

            students.add(new Student(
                    id,
                    st.nextToken()
            ));
        }

        students.sort((o1, o2) -> {
            if (o1.team == o2.team) {
                if (o1.id == o2.id) {
                    if (o1.name.length() == o2.name.length()) {
                        return o1.name.compareTo(o2.name);
                    }
                    return o1.name.length() - o2.name.length();
                }
                return o1.id - o2.id;
            }
            return o1.team - o2.team;
        });

        for (Student student : students) {
            sb.append(student.id).append(' ').append(student.name).append('\n');
        }

        System.out.println(sb);
    }
}
