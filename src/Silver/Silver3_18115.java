package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Silver3_18115 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfCards = Integer.parseInt(br.readLine());
        int[] cards = new int[numOfCards];
        Deque<Integer> remainIndexes = new ArrayDeque<>();

        for (int i = 0; i < numOfCards; i++) {
            remainIndexes.offer(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = numOfCards; i > 0; i--) {
            int technique = Integer.parseInt(st.nextToken());

            if (technique == 1) {
                cards[remainIndexes.pollFirst()] = i;
            } else if (technique == 2) {
                int tempIndex = remainIndexes.pollFirst();
                cards[remainIndexes.pollFirst()] = i;
                remainIndexes.offerFirst(tempIndex);
            } else {
                cards[remainIndexes.pollLast()] = i;
            }
        }

        for (int card : cards) {
            sb.append(card).append(' ');
        }

        System.out.println(sb);
    }
}
