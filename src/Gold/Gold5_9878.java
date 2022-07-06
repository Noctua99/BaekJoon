package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_9878 {

    static PriorityQueue<Integer> timeQueue = new PriorityQueue<>();
    static PriorityQueue<Integer> distanceQueue = new PriorityQueue<>();

    public static int findTotalTime() {
        double curT = 0;
        double curD = 0;
        int timeRequired = 1;   // 1m를 이동하는데 필요한 시간

        while (!timeQueue.isEmpty() || !distanceQueue.isEmpty()) {
            int tempT = Integer.MAX_VALUE;
            int tempD = 100000;

            if (!timeQueue.isEmpty()) {
                tempT = timeQueue.peek();
            }

            if (!distanceQueue.isEmpty()) {
                tempD = distanceQueue.peek();
            }

            double diffT1 = tempT - curT;
            double diffT2 = (tempD - curD) * timeRequired;

            if (diffT1 < diffT2) {
                curD += (diffT1) / timeRequired;
                curT = tempT;

                timeQueue.poll();
            } else if (diffT1 == diffT2) {
                curT = tempT;
                curD = tempD;

                timeRequired++;

                timeQueue.poll();
                distanceQueue.poll();
            } else {
                curT += diffT2;
                curD = tempD;

                distanceQueue.poll();
            }
            timeRequired++;
        }

        if (curD < 1000) {
            curT += (1000 - curD) * timeRequired;
        }

        return (int) Math.round(curT);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int eventsCount = Integer.parseInt(br.readLine());

        while (eventsCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.nextToken().charAt(0) == 'T') {
                timeQueue.offer(Integer.parseInt(st.nextToken()));
            } else {
                distanceQueue.offer(Integer.parseInt(st.nextToken()));
            }
        }

        System.out.println(findTotalTime());
    }
}
