package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Silver5_14729 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfStudents = Integer.parseInt(br.readLine());
        PriorityQueue<Double> grades = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < 7; i++) {
            grades.add(Double.parseDouble(br.readLine()));
        }

        for (int i = 7; i < numOfStudents; i++) {
            grades.add(Double.parseDouble(br.readLine()));
            grades.poll();
        }

        String[] sortedGrades = new String[7];

        for (int i = 0; i < 7; i++) {
            sortedGrades[6 - i] = String.format("%.3f", grades.poll());
        }

        for (String grade : sortedGrades) {
            sb.append(grade).append('\n');
        }

        System.out.println(sb);
    }
}
