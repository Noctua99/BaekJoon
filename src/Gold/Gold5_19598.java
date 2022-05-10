package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_19598 {

    static class Meeting {
        final int startTime;
        final int endTime;

        Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static int findMinMeetingRooms(PriorityQueue<Meeting> meetings, PriorityQueue<Integer> endTimes) {

        endTimes.offer(meetings.poll().endTime);
        while (!meetings.isEmpty()) {
            if (meetings.peek().startTime >= endTimes.peek()) {
                endTimes.poll();
            }
            endTimes.offer(meetings.poll().endTime);
        }

        return endTimes.size();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Meeting> meetings = new PriorityQueue<>(Comparator.comparingInt(o -> o.startTime));
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();

        int numOfMeetings = Integer.parseInt(br.readLine());

        while (numOfMeetings-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings.offer(new Meeting(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        System.out.println(findMinMeetingRooms(meetings, endTimes));
    }
}
