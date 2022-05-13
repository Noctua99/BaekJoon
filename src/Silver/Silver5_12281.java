package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver5_12281 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());

        for (int i = 1; i <= numOfTests; i++) {
            int numOfBooks = Integer.parseInt(br.readLine());

            boolean[] isEven = new boolean[numOfBooks];
            PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Integer> odd = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numOfBooks; j++) {
                int valueOfBook = Integer.parseInt(st.nextToken());

                if (valueOfBook % 2 == 0) {
                    even.offer(valueOfBook);
                    isEven[j] = true;
                } else {
                    odd.offer(valueOfBook);
                }
            }

            sb.append("Case #").append(i).append(": ");

            for (boolean b : isEven) {
                sb.append(b ? even.poll() : odd.poll()).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
