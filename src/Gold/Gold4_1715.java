package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Gold4_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        int numOfCards = Integer.parseInt(br.readLine());
        while (numOfCards-- > 0) {
            cards.offer(Integer.parseInt(br.readLine()));
        }

        int totalComp = 0;
        while (cards.size() > 1) {
            int card1 = cards.poll();
            int card2 = cards.poll();
            int sum = card1 + card2;
            totalComp += sum;
            cards.offer(sum);
        }

        System.out.println(totalComp);
    }
}
