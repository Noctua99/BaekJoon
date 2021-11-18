package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Gold4_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수열의 크기(N은 50보다 작은 자연수)

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        Stack<Integer> plusNumbers = new Stack<>();
        Deque<Integer> minusNumbers = new ArrayDeque<>();
        int zeroCount = 0;

        for (int number : numbers) {
            if (number < 0) {
                minusNumbers.offer(number);
            } else if (number > 0) {
                plusNumbers.push(number);
            } else {
                zeroCount++;
            }
        }

        int sum = 0;

        while (plusNumbers.size() > 1) {
            int tempA = plusNumbers.pop();
            int tempB = plusNumbers.pop();
            if (tempA == 1 | tempB == 1) {      // 둘 중 하나가 1일 때는 더하는 것이 더 크다
                sum += tempA + tempB;
            } else {
                sum += tempA * tempB;
            }
        }
        if (!plusNumbers.isEmpty()) {
            sum += plusNumbers.pop();
        }

        while (minusNumbers.size() > 1) {
            sum += minusNumbers.poll() * minusNumbers.poll();
        }
        if (!minusNumbers.isEmpty() && zeroCount == 0) {
            sum += minusNumbers.poll();
        }

        System.out.println(sum);
    }
}
