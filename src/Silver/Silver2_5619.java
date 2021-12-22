package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Silver2_5619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        if (numbers.length <= 3) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    priorityQueue.offer(Integer.parseInt(numbers[i] + "" + numbers[j]));
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        continue;
                    }
                    priorityQueue.offer(Integer.parseInt(numbers[i] + "" + numbers[j]));
                }
            }
        }
        priorityQueue.poll();
        priorityQueue.poll();

        System.out.println(priorityQueue.poll());
    }
}
