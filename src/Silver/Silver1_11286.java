package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver1_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 연산의 개수

        PriorityQueue<Integer> absoluteQueue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                return o1 - o2;
            } else {
                return abs1 - abs2;
            }
        });
        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                absoluteQueue.offer(x);
            } else {
                if (absoluteQueue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(absoluteQueue.poll()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
