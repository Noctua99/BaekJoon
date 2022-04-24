package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Bronze1_9933 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> words = new HashSet<>();

        int wordsNum = Integer.parseInt(br.readLine());
        while (wordsNum-- > 0) {
            String word = br.readLine();
            String reverseWord = new StringBuilder(word).reverse().toString();

            if (words.contains(word)) {
                sb.append(word.length()).append(' ').append(word.charAt(word.length() / 2));
                break;
            } else {
                words.add(word);
            }

            if (words.contains(reverseWord)) {
                sb.append(word.length()).append(' ').append(word.charAt(word.length() / 2));
                break;
            } else {
                words.add(reverseWord);
            }
        }

        System.out.println(sb);
    }
}
