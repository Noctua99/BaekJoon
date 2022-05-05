package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Silver4_9612 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> wordsToFreq = new HashMap<>();

        int numOfWords = Integer.parseInt(br.readLine());
        while (numOfWords-- > 0) {
            String word = br.readLine();
            wordsToFreq.put(word, wordsToFreq.getOrDefault(word, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        for (int freq : wordsToFreq.values()) {
            maxFreq = Math.max(freq, maxFreq);
        }

        PriorityQueue<String> wordsHasHighestFreq = new PriorityQueue<>(Comparator.reverseOrder());

        for (Map.Entry<String, Integer> entry : wordsToFreq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                wordsHasHighestFreq.add(entry.getKey());
            }
        }

        System.out.println(wordsHasHighestFreq.peek() + " " + maxFreq);
    }
}
