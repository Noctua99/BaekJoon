package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Gold2_1655 {
    static PriorityQueue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> rightQueue = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (!leftQueue.isEmpty() && num > leftQueue.peek()) {
                rightQueue.offer(num);
            } else {
                leftQueue.offer(num);
            }
            makeBalance();
            sb.append(leftQueue.peek()).append('\n');
        }

        System.out.println(sb);
    }

    public static void makeBalance() {
        if (leftQueue.size() > rightQueue.size() + 1) {
            rightQueue.offer(leftQueue.poll());
        }
        if (leftQueue.size() < rightQueue.size()) {
            leftQueue.offer(rightQueue.poll());
        }
    }
}
