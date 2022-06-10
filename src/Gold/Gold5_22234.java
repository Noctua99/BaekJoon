package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold5_22234 {

    static class Client {
        final int id;
        int timeRequired;
        int enterTime;

        public Client(int id, int timeRequired) {
            this.id = id;
            this.timeRequired = timeRequired;
        }

        public Client(int id, int timeRequired, int enterTime) {
            this.id = id;
            this.timeRequired = timeRequired;
            this.enterTime = enterTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Client> waitingLine = new ArrayDeque<>();
        Queue<Client> additionalClients = new PriorityQueue<>(Comparator.comparingInt(o -> o.enterTime));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            waitingLine.offer(new Client(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        int M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            additionalClients.offer(new Client(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        for (int t = 0; t < W; ) {
            Client current = waitingLine.poll();
            int minTime = Math.min(W - t, Math.min(current.timeRequired, T));

            for (int i = 0; i < minTime; i++) {
                sb.append(current.id).append('\n');
            }

            t += minTime;

            while (!additionalClients.isEmpty() && additionalClients.peek().enterTime <= t) {
                waitingLine.offer(additionalClients.poll());
            }

            if (T < current.timeRequired) {
                current.timeRequired -= minTime;
                waitingLine.offer(current);
            }
        }

        System.out.println(sb);
    }
}
