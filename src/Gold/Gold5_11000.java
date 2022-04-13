package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold5_11000 {

    static class Lecture {
        final int startTime;
        final int endTime;

        public Lecture(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lecturesNum = Integer.parseInt(br.readLine());

        Lecture[] lectures = new Lecture[lecturesNum];
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(0);

        for (int i = 0; i < lecturesNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lectures[i] = new Lecture(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(lectures, Comparator.comparingInt(o -> o.startTime));

        for (Lecture lecture : lectures) {
            if (lecture.startTime >= priorityQueue.peek()) {
                priorityQueue.poll();
            }
            priorityQueue.offer(lecture.endTime);
        }

        System.out.println(priorityQueue.size());
    }
}
