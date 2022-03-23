package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_24509 {

    static class Student {
        final int id;
        final int kor;
        final int eng;
        final int mat;
        final int sci;

        public Student(int id, int kor, int eng, int mat, int sci) {
            this.id = id;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
            this.sci = sci;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfStudents = Integer.parseInt(br.readLine());
        Student[] students = new Student[numOfStudents + 1];
        boolean[] isReceived = new boolean[numOfStudents + 1];  // 상품을 이미 받은 경우 true

        students[0] = new Student(-1, -1, -1, -1, -1);
        for (int i = 1; i <= numOfStudents; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        // 국어
        int maxIndex = 0;
        for (int i = 1; i <= numOfStudents; i++) {
            if (students[maxIndex].kor < students[i].kor) {
                maxIndex = i;
            } else if (students[maxIndex].kor == students[i].kor) {
                maxIndex = students[maxIndex].id > students[i].id ? i : maxIndex;
            }
        }
        sb.append(students[maxIndex].id).append(' ');
        isReceived[maxIndex] = true;

        // 영어
        maxIndex = 0;
        for (int i = 1; i <= numOfStudents; i++) {
            if (isReceived[i]) continue;

            if (students[maxIndex].eng < students[i].eng) {
                maxIndex = i;
            } else if (students[maxIndex].eng == students[i].eng) {
                maxIndex = students[maxIndex].id > students[i].id ? i : maxIndex;
            }
        }
        sb.append(students[maxIndex].id).append(' ');
        isReceived[maxIndex] = true;

        // 수학
        maxIndex = 0;
        for (int i = 1; i <= numOfStudents; i++) {
            if (isReceived[i]) continue;

            if (students[maxIndex].mat < students[i].mat) {
                maxIndex = i;
            } else if (students[maxIndex].mat == students[i].mat) {
                maxIndex = students[maxIndex].id > students[i].id ? i : maxIndex;
            }
        }
        sb.append(students[maxIndex].id).append(' ');
        isReceived[maxIndex] = true;

        // 과학
        maxIndex = 0;
        for (int i = 1; i <= numOfStudents; i++) {
            if (isReceived[i]) continue;

            if (students[maxIndex].sci < students[i].sci) {
                maxIndex = i;
            } else if (students[maxIndex].sci == students[i].sci) {
                maxIndex = students[maxIndex].id > students[i].id ? i : maxIndex;
            }
        }
        sb.append(students[maxIndex].id);

        System.out.println(sb);
    }
}
