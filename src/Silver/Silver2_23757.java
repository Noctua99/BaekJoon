package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver2_23757 {

    static PriorityQueue<Integer> gifts = new PriorityQueue<>(Comparator.reverseOrder());

    public static boolean isPossible(int childrenNum, String input) {

        StringTokenizer st = new StringTokenizer(input);
        while (childrenNum-- > 0) {
            int desiredNum = Integer.parseInt(st.nextToken());

            if (desiredNum > gifts.peek()) {
                return false;
            }

            gifts.offer(gifts.poll() - desiredNum);
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int giftsNum = Integer.parseInt(st.nextToken());
        int childrenNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (giftsNum-- > 0) {
            gifts.offer(Integer.parseInt(st.nextToken()));
        }

        System.out.println(isPossible(childrenNum, br.readLine()) ? 1 : 0);
    }
}
