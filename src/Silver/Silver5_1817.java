package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver5_1817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfBooks = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());

        if (numOfBooks == 0) {
            System.out.println(0);
        } else {
            Queue<Integer> books = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());
            while (numOfBooks-- > 0) {
                books.offer(Integer.parseInt(st.nextToken()));
            }

            int minBoxes = 1;
            int sum = 0;
            while (!books.isEmpty()) {
                int book = books.poll();
                if (sum + book > maxWeight) {
                    minBoxes++;
                    sum = 0;
                }
                sum += book;
            }

            System.out.println(minBoxes);
        }
    }
}
