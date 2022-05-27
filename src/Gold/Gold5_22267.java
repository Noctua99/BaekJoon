package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_22267 {

    static PriorityQueue<Integer> boxes = new PriorityQueue<>();

    public static boolean isPossible() {
        if (boxes.size() == 1) return false;

        int count = 0;

        while (boxes.size() >= 2) {
            if ((int) boxes.poll() == boxes.peek()) {
                boxes.offer(boxes.poll() + 1);
            } else {
                count++;
            }

            if (count > 2) break;
        }

        return (count + boxes.size()) <= 2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfBoxes = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (numOfBoxes-- > 0) {
            boxes.offer(Integer.parseInt(st.nextToken()));
        }

        System.out.println(isPossible() ? "Y" : "N");
    }
}
