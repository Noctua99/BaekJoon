package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver1_17225 {

    static class Present implements Comparable<Present> {
        final int startTime;   // 포장을 시작한 시간
        final char color; // 포장지의 색깔

        public Present(int startTime, char color) {
            this.startTime = startTime;
            this.color = color;
        }

        @Override
        public int compareTo(Present o) {
            if (this.startTime == o.startTime) {
                return this.color - o.color;
            }

            return this.startTime - o.startTime;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int timeS = Integer.parseInt(st.nextToken());   // 상민이가 선물 하나를 포장하는 데 걸리는 시간
        int timeJ = Integer.parseInt(st.nextToken());   // 지수가 선물 하나를 포장하는 데 걸리는 시간
        int customersNum = Integer.parseInt(st.nextToken());   // 어제 세훈이 가게의 손님 수

        List<Present> presents = new ArrayList<>();
        int startTimeS = 0;
        int startTimeJ = 0;

        while (customersNum-- > 0) {
            st = new StringTokenizer(br.readLine());
            int timeOfOrder = Integer.parseInt(st.nextToken());    // 손님의 주문 시각
            char color = st.nextToken().charAt(0);  // 선택한 포장지의 색깔
            int giftsNum = Integer.parseInt(st.nextToken());    // 주문한 선물의 개수

            if (color == 'B') {
                while (giftsNum-- > 0) {
                    if (startTimeS >= timeOfOrder) {
                        presents.add(new Present(startTimeS, color));
                        startTimeS += timeS;
                    } else {
                        presents.add(new Present(timeOfOrder, color));
                        startTimeS = timeOfOrder + timeS;
                    }
                }
            } else {
                while (giftsNum-- > 0) {
                    if (startTimeJ >= timeOfOrder) {
                        presents.add(new Present(startTimeJ, color));
                        startTimeJ += timeJ;
                    } else {
                        presents.add(new Present(timeOfOrder, color));
                        startTimeJ = timeOfOrder + timeJ;
                    }
                }
            }
        }

        Collections.sort(presents);

        List<Integer> presentsS = new ArrayList<>(); // 상민이가 포장한 선물들의 번호
        List<Integer> presentsJ = new ArrayList<>(); // 지수가 포장한 선물들의 번호

        int presentsCount = 1;
        for (Present present : presents) {
            if (present.color == 'B') {
                presentsS.add(presentsCount);
            } else {
                presentsJ.add(presentsCount);
            }

            presentsCount++;
        }

        sb.append(presentsS.size()).append('\n');
        for (int present : presentsS) {
            sb.append(present).append(' ');
        }
        sb.append('\n');

        sb.append(presentsJ.size()).append('\n');
        for (int present : presentsJ) {
            sb.append(present).append(' ');
        }

        System.out.println(sb);
    }
}
