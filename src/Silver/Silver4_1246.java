package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver4_1246 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < M; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        while (pq.size() > N) {
            pq.poll();
        }

        int minPrice = pq.peek();
        int maxProfit = pq.poll() * (pq.size() + 1);

        while (!pq.isEmpty()) {
            int price = pq.poll();

            if (price * (pq.size() + 1) > maxProfit) {
                minPrice = price;
                maxProfit = price * (pq.size() + 1);
            }
        }

        System.out.println(minPrice + " " + maxProfit);
    }
}