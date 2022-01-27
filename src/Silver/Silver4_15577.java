package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver4_15577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Double> grades = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            grades.offer(Double.parseDouble(br.readLine()));
        }

        while (grades.size() >= 2) {
            grades.offer((grades.poll() + grades.poll()) / 2);
        }

        System.out.println(grades.peek());
    }
}
