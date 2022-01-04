package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Silver4_16499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfWords = Integer.parseInt(br.readLine());

        HashSet<HashMap<Character, Integer>> words = new HashSet<>();

        while (numOfWords-- > 0) {
            HashMap<Character, Integer> word = new HashMap<>();

            String input = br.readLine();
            for (int i = 0; i < input.length(); i++) {
                word.put(input.charAt(i), word.getOrDefault(input.charAt(i), 0) + 1);
            }
            words.add(word);
        }
        System.out.println(words.size());
    }
}
