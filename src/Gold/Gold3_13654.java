package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold3_13654 {

    static class Object {
        final int min;
        final int max;

        public Object(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        while ((input = br.readLine()) != null) {
            PriorityQueue<Object> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.max));

            int N = Integer.parseInt(input);
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                pq.offer(new Object(
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken())
                ));
            }

            int count = 0;

            while (!pq.isEmpty()) {
                int max = pq.poll().max;
                while (!pq.isEmpty() && pq.peek().min <= max) {
                    pq.poll();
                }
                count++;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
