package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver2_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());     // 카드의 개수
        int M = Integer.parseInt(st.nextToken());     // 카드 합체를 몇 번 하는 지

        PriorityQueue<Long> cards = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            cards.offer(Long.parseLong(st.nextToken()));
        }

        while (M-- > 0) {
            long num1 = cards.poll();
            long num2 = cards.poll();
            num1 = num2 = num1 + num2;
            cards.offer(num1);
            cards.offer(num2);
        }

        long sum = 0;
        for (long card : cards) {
            sum += card;
        }
        System.out.println(sum);
    }
}
