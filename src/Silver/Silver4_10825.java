package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Silver4_10825 {
    static class Student implements Comparable<Student> {
        String name;
        int korScore;
        int engScore;
        int matScore;

        public Student(String name, int korScore, int engScore, int matScore) {
            this.name = name;
            this.korScore = korScore;
            this.engScore = engScore;
            this.matScore = matScore;
        }

        @Override
        public int compareTo(Student student) {
            if (this.korScore == student.korScore) {
                if (this.engScore == student.engScore) {
                    if (this.matScore == student.matScore) {
                        return this.name.compareTo(student.name);
                    }
                }
            }
            return this.korScore - student.korScore;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Student> students = new ArrayList<>();

        int numOfStud = Integer.parseInt(br.readLine());
        while (numOfStud-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korScore = Integer.parseInt(st.nextToken());
            int engScore = Integer.parseInt(st.nextToken());
            int matScore = Integer.parseInt(st.nextToken());
            students.add(new Student(name, korScore, engScore, matScore));
        }

        Collections.sort(students);

        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name).append('\n');
        }

        System.out.println(sb);
    }
}
