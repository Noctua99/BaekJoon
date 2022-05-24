package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver4_15323 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Queue<String>> letterToWord = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfWords = Integer.parseInt(st.nextToken());
        int numOfLetters = Integer.parseInt(st.nextToken());

        String[] words = new String[numOfWords];

        for (int i = 0; i < numOfWords; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words);

        for (String word : words) {
            char letter = word.charAt(0);

            if (!letterToWord.containsKey(letter)) {
                letterToWord.put(letter, new ArrayDeque<>());
            }
            letterToWord.get(letter).offer(word);
        }

        while (numOfLetters-- > 0) {
            char letter = br.readLine().charAt(0);
            Queue<String> queue = letterToWord.get(letter);
            sb.append(queue.peek()).append('\n');
            queue.offer(queue.poll());
            letterToWord.put(letter, queue);
        }

        System.out.println(sb);
    }
}
