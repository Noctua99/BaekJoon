package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver3_12018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numOfSubj = Integer.parseInt(st.nextToken());   // 과목 수
        int totalMileage = Integer.parseInt(st.nextToken());    // 주어진 마일리지

        PriorityQueue<Integer> minMileages = new PriorityQueue<>();

        while (numOfSubj-- > 0) {
            st = new StringTokenizer(br.readLine());
            int numOfApplicant = Integer.parseInt(st.nextToken());  // 각 과목에 신청한 사람 수
            int enrollLimit = Integer.parseInt(st.nextToken());     // 과목의 수강가능인원

            st = new StringTokenizer(br.readLine());
            // 신청한 사람이 수강가능인원 보다 적다면 최소 마일리지인 1만 사용
            if (numOfApplicant < enrollLimit) {
                minMileages.offer(1);
            } else {
                PriorityQueue<Integer> enrolledMileages = new PriorityQueue<>();
                while (numOfApplicant-- > 0) {
                    enrolledMileages.offer(Integer.parseInt(st.nextToken()));
                }
                while (enrolledMileages.size() > enrollLimit) {
                    enrolledMileages.poll();
                }
                minMileages.offer(enrolledMileages.peek());
            }
        }
        int count = 0;
        while (!minMileages.isEmpty()) {
            totalMileage -= minMileages.poll();
            if (totalMileage < 0)
                break;
            count++;
        }
        System.out.println(count);
    }
}
