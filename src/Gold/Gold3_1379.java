package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold3_1379 {

    static class Lecture {
        final int id;
        final int startTime;
        final int endTime;

        public Lecture(int id, int startTime, int endTime) {
            this.id = id;
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Lecture> startTimes = new PriorityQueue<>(Comparator.comparing(o -> o.startTime));
        PriorityQueue<Lecture> endTimes = new PriorityQueue<>(Comparator.comparing(o -> o.endTime));

        int numOfLectures = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfLectures; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            startTimes.offer(new Lecture(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        int[] result = new int[numOfLectures + 1];

        int numOfRooms = 1;

        result[startTimes.peek().id] = numOfRooms;
        endTimes.offer(startTimes.poll());

        while (!startTimes.isEmpty()) {
            Lecture tempLecture = startTimes.poll();

            if (tempLecture.startTime >= endTimes.peek().endTime) {
                result[tempLecture.id] = result[endTimes.poll().id];
                endTimes.offer(tempLecture);
            } else {
                result[tempLecture.id] = ++numOfRooms;
                endTimes.offer(tempLecture);
            }
        }

        sb.append(numOfRooms).append('\n');

        for (int i = 1; i <= numOfLectures; i++) {
            sb.append(result[i]).append('\n');
        }

        System.out.println(sb);
    }
}
