package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver3_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> presents = new PriorityQueue<>(Collections.reverseOrder());

        int numOfVisits = Integer.parseInt(br.readLine());
        while (numOfVisits-- > 0) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            if (first == 0) {
                if (presents.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(presents.poll()).append('\n');
                }
            } else {
                while (first-- > 0) {
                    presents.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
    }
}
