package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    final String name;
    final int day;
    final int month;
    final int year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Student s) {
        if (this.year == s.year) {
            if (this.month == s.month) {
                return s.day - this.day;
            } else {
                return s.month - this.month;
            }
        } else {
            return s.year - this.year;
        }
    }
}

public class Silver5_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeSet<Student> students = new TreeSet<>();

        int numOfStud = Integer.parseInt(br.readLine());
        while (numOfStud-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students.add(new Student(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }
        sb.append(students.first().name).append('\n').append(students.last().name);

        System.out.println(sb);
    }
}
