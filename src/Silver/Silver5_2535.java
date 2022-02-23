package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_2535 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfStud = Integer.parseInt(br.readLine());

        Student[] students = new Student[numOfStud];
        int[] awardedNationCounts = new int[numOfStud + 1];

        for (int i = 0; i < numOfStud; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students, (o1, o2) -> o2.score - o1.score);

        int awardedCount = 0;
        for (Student student : students) {
            if (awardedNationCounts[student.nationId] < 2) {
                awardedNationCounts[student.nationId]++;
                awardedCount++;
                sb.append(student.nationId).append(' ').append(student.studentId).append('\n');
            }

            if (awardedCount == 3) break;
        }

        System.out.println(sb);
    }

    static class Student {
        final int nationId;
        final int studentId;
        final int score;

        public Student(int nationId, int studentId, int score) {
            this.nationId = nationId;
            this.studentId = studentId;
            this.score = score;
        }
    }
}
