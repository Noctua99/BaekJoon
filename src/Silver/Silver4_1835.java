package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Silver4_1835 {

    public static String findInitialOrder(int N) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = N; i >= 1; i--) {
            deque.offerFirst(i);

            for (int j = 0; j < i % (N - i + 1); j++) {
                deque.offerFirst(deque.pollLast());
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int data : deque) {
            sb.append(data).append(' ');
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findInitialOrder(Integer.parseInt(br.readLine())));
    }
}
