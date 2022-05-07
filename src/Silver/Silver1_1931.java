package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver1_1931 {

    static class Conference {
        final int startTime;
        final int endTime;

        Conference(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Conference> conferences = new PriorityQueue<>((o1, o2) -> {
            if (o1.endTime == o2.endTime) {
                return o1.startTime - o2.startTime;
            }
            return o1.endTime - o2.endTime;
        });

        int confNum = Integer.parseInt(br.readLine());  // 회의의 수
        for (int i = 0; i < confNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            conferences.add(new Conference(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        Conference prevConf = conferences.poll();
        int confCount = 1;
        while (!conferences.isEmpty()) {
            Conference nowConf = conferences.poll();
            if (nowConf.startTime >= prevConf.endTime) {
                prevConf = nowConf;
                confCount++;
            }
        }

        System.out.println(confCount);
    }
}
