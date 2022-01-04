package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Silver5_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfCandidate = Integer.parseInt(br.readLine());

        int target = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> votes = new PriorityQueue<>(Collections.reverseOrder());
        while (numOfCandidate-- > 1) {
            votes.offer(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        if (!votes.isEmpty()) {
            while (target <= votes.peek()) {
                votes.offer(votes.poll() - 1);
                target++;
                result++;
            }
        }
        System.out.println(result);
    }
}
