package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Silver2_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());    // 연산의 개수

        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());    // x가 자연수면 배열에 x라는 값을 추가, 0이라면 배열에서 가장 큰 값을 출력하고 제거

            if (x > 0) {
                maxHeap.offer(x);
            } else {
                if (maxHeap.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(maxHeap.poll()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
