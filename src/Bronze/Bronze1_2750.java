package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bronze1_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        while (N-- > 0) {
            numbers.offer(Integer.parseInt(br.readLine()));
        }
        while (!numbers.isEmpty()) {
            sb.append(numbers.poll()).append('\n');
        }
        System.out.println(sb);
    }
}
