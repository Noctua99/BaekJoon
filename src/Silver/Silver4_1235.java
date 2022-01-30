package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver4_1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfStud = Integer.parseInt(br.readLine());
        String[] students = new String[numOfStud];

        for (int i = 0; i < numOfStud; i++) {
            students[i] = br.readLine();
        }

        System.out.println(findMinLength(students, numOfStud));
    }

    public static int findMinLength(String[] students, int numOfStud) {
        int len = students[0].length();
        for (int i = 1; i < len; i++) {
            HashSet<String> set = new HashSet<>();
            for (String student : students) {
                set.add(student.substring(len - i, len));
            }
            if (set.size() == numOfStud) {
                return i;
            }
        }
        return len;
    }
}
