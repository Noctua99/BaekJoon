package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Silver5_25325 {

    static class Student {
        final String name;
        final int popularity;

        public Student(String name, int popularity) {
            this.name = name;
            this.popularity = popularity;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> hashMap = new HashMap<>();

        int studentCount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < studentCount; i++) {
            hashMap.put(st.nextToken(), 0);
        }

        while (studentCount-- > 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String name = st.nextToken();
                hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
            }
        }

        ArrayList<Student> students = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            students.add(new Student(
                    entry.getKey(),
                    entry.getValue()
            ));
        }

        students.sort((o1, o2) -> {
            if (o1.popularity == o2.popularity) {
                return o1.name.compareTo(o2.name);
            }
            return o2.popularity - o1.popularity;
        });

        for (Student student : students) {
            sb.append(student.name).append(' ').append(student.popularity).append('\n');
        }

        System.out.println(sb);
    }
}
