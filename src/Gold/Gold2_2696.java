package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold2_2696 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수
        while (T-- > 0) {
            PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Integer> right = new PriorityQueue<>();

            left.offer(Integer.MIN_VALUE);
            right.offer(Integer.MAX_VALUE);

            int M = Integer.parseInt(br.readLine());    // 수열의 크기

            sb.append(M / 2 + 1).append('\n');

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= M; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num <= right.peek()) {
                    left.offer(num);
                } else {
                    right.offer(num);
                }

                if (i % 2 == 1) {
                    while (left.size() - 1 > right.size()) {
                        right.offer(left.poll());
                    }

                    while (left.size() - 1 < right.size()) {
                        left.offer(right.poll());
                    }

                    sb.append(left.peek()).append(' ');
                }

                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                if (i % 20 == 0) {
                    sb.append('\n');
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
