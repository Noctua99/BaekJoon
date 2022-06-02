package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_6235 {

    static class Query {
        final int id;
        final int period;
        int time;

        public Query(int id, int period) {
            this.id = id;
            this.period = period;
            time = period;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Query> queries = new PriorityQueue<>((o1, o2) -> {
            if (o1.time == o2.time) {
                return o1.id - o2.id;
            }
            return o1.time - o2.time;
        });

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.nextToken().equals("#")) {
                break;
            }

            queries.offer(new Query(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        int K = Integer.parseInt(br.readLine());

        while (K-- > 0) {
            Query query = queries.poll();

            query.time += query.period;
            queries.offer(query);

            sb.append(queries.peek()).append('\n');
        }

        System.out.println(sb);
    }
}
