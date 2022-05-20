package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold3_2109 {

    static class Speaking {
        final int fee;
        final int deadLine;

        public Speaking(int fee, int deadLine) {
            this.fee = fee;
            this.deadLine = deadLine;
        }
    }

    static Speaking[] speakings;
    static PriorityQueue<Integer> fees = new PriorityQueue<>();

    public static int findMaxFee() {
        if (speakings.length == 0) {
            return 0;
        }

        int maxFee = 0;

        fees.offer(speakings[0].fee);

        for (int i = 1; i < speakings.length; i++) {
            if (speakings[i].deadLine > fees.size()) {
                fees.offer(speakings[i].fee);
            } else {
                if (speakings[i].fee > fees.peek()) {
                    fees.poll();
                    fees.offer(speakings[i].fee);
                }
            }
        }

        for (int fee : fees) {
            maxFee += fee;
        }

        return maxFee;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfSpeakings = Integer.parseInt(br.readLine());

        speakings = new Speaking[numOfSpeakings];

        for (int i = 0; i < numOfSpeakings; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            speakings[i] = new Speaking(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(speakings, Comparator.comparingInt(o -> o.deadLine));

        System.out.println(findMaxFee());
    }
}
