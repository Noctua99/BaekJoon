package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold5_1501 {

    static class Word {
        final int len;
        final char first;
        final char last;
        final char[] chars;

        public Word(int len, char first, char last, char[] chars) {
            this.len = len;
            this.first = first;
            this.last = last;
            this.chars = chars;
        }

        @Override
        public boolean equals(Object o) {
            Word word = (Word) o;
            return len == word.len && first == word.first && last == word.last && Arrays.equals(chars, word.chars);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(len, first, last);
            result = 31 * result + Arrays.hashCode(chars);
            return result;
        }
    }

    public static Word getWord(String s) {
        char[] chars = new char[58];

        for (int i = 1; i < s.length() - 1; i++) {
            chars[s.charAt(i) - 'A']++;
        }

        return new Word(
                s.length(),
                s.charAt(0),
                s.charAt(s.length() - 1),
                chars
        );
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Word, Integer> wordToCount = new HashMap<>();

        int wordCount = Integer.parseInt(br.readLine());
        while (wordCount-- > 0) {

            Word word = getWord(br.readLine());

            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        int sentenceCount = Integer.parseInt(br.readLine());
        while (sentenceCount-- > 0) {

            ArrayList<Integer> caseList = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {

                Word word = getWord(st.nextToken());

                if (wordToCount.containsKey(word)) {
                    caseList.add(wordToCount.get(word));
                }
            }

            int caseCount = 0;

            if (!caseList.isEmpty()) {
                caseCount = 1;

                for (int count : caseList) {
                    caseCount *= count;
                }
            }
            sb.append(caseCount).append('\n');
        }

        System.out.println(sb);
    }
}
