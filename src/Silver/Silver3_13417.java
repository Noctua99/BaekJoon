package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Silver3_13417 {

    public static StringBuilder solve(int numOfCards, String input) {

        Deque<Character> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(input);
        deque.offer(st.nextToken().charAt(0));

        for (int i = 1; i < numOfCards; i++) {
            char ch = st.nextToken().charAt(0);
            if (ch <= deque.getFirst()) {
                deque.offerFirst(ch);
            } else {
                deque.offerLast(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : deque) {
            sb.append(ch);
        }

        return sb;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());

        while (numOfTests-- > 0) {
            int numOfCards = Integer.parseInt(br.readLine());

            sb.append(solve(numOfCards, br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
}
