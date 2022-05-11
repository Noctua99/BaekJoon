package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_8547 {

    static PriorityQueue<Integer> sticks = new PriorityQueue<>();

    public static int findNumOfSticks() {
        int numOfSticks = 0;

        while (sticks.size() >= 2) {
            int tempStick = sticks.poll();

            if (tempStick == sticks.peek()) {
                sticks.offer(tempStick + sticks.poll());
            } else {
                numOfSticks++;
            }
        }

        return numOfSticks + 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfSticks = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (numOfSticks-- > 0) {
            sticks.offer(Integer.parseInt(st.nextToken()));
        }

        System.out.println(findNumOfSticks());
    }
}
