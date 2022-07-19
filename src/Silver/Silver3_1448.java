package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Silver3_1448 {

    static PriorityQueue<Integer> straws = new PriorityQueue<>(Comparator.reverseOrder());

    public static int findMinSum() {
        while (straws.size() >= 3) {
            int max = straws.poll();
            int mid = straws.poll();
            int min = straws.poll();

            if (max < (mid + min)) {
                return (max + mid + min);
            } else {
                straws.offer(mid);
                straws.offer(min);
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int strawCount = Integer.parseInt(br.readLine());

        while (strawCount-- > 0) {
            straws.offer(Integer.parseInt(br.readLine()));
        }

        System.out.println(findMinSum());
    }
}
