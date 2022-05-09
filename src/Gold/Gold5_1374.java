package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_1374 {

    static class Lecture {
        final int startTime;
        final int endTime;

        Lecture(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfLectures = Integer.parseInt(br.readLine());

        PriorityQueue<Lecture> lectures = new PriorityQueue<>(Comparator.comparingInt(o -> o.startTime));
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();

        while (numOfLectures-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            lectures.offer(new Lecture(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        endTimes.offer(lectures.poll().endTime);
        while (!lectures.isEmpty()) {
            if (lectures.peek().startTime >= endTimes.peek()) {
                endTimes.poll();
            }
            endTimes.offer(lectures.poll().endTime);
        }

        System.out.println(endTimes.size());
    }
}
