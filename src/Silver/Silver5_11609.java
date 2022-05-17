package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_11609 {

    static class Student {
        final String firstName;
        final String lastName;

        Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfStudents = Integer.parseInt(br.readLine());

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(
                    st.nextToken(),
                    st.nextToken()
            );
        }

        Arrays.sort(students, (o1, o2) -> {
            if (o1.lastName.equals(o2.lastName)) {
                return o1.firstName.compareTo(o2.firstName);
            }
            return o1.lastName.compareTo(o2.lastName);
        });

        for (Student student : students) {
            sb.append(student.firstName).append(' ').append(student.lastName).append('\n');
        }

        System.out.println(sb);
    }
}
