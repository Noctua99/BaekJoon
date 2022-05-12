package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Silver3_2910 {

    static class Number {
        final int value;
        final int seq;
        final int freq;

        Number(int value, int seq, int freq) {
            this.value = value;
            this.seq = seq;
            this.freq = freq;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> numToSeq = new HashMap<>();
        HashMap<Integer, Integer> numToFreq = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lenOfMessage = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lenOfMessage; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (!numToSeq.containsKey(num)) {
                numToSeq.put(num, i);
            }

            numToFreq.put(num, numToFreq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Number> numbers = new PriorityQueue<>((o1, o2) -> {
            if (o1.freq == o2.freq) {
                return o1.seq - o2.seq;
            }
            return o2.freq - o1.freq;
        });

        for (Map.Entry<Integer, Integer> entry : numToSeq.entrySet()) {
            int num = entry.getKey();
            numbers.offer(new Number(
                    num,
                    entry.getValue(),
                    numToFreq.get(num)
            ));
        }

        while (!numbers.isEmpty()) {
            Number number = numbers.poll();
            int value = number.value;
            int freq = number.freq;

            while (freq-- > 0) {
                sb.append(value).append(' ');
            }
        }

        System.out.println(sb);
    }
}
