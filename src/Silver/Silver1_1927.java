package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver1_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());    // 연산의 개수

        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());    // x가 자연수면 배열에 x라는 값을 추가, 0이라면 배열에서 가장 작은 값을 출력하고 제거

            if (x > 0) {
                minHeap.offer(x);
            } else {
                if (minHeap.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(minHeap.poll()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
