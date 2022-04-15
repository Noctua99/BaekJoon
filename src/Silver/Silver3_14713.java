package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver3_14713 {

    public static boolean isPossible(int parrotsNum, HashMap<String, Integer> wordsToIndex,
                                     StringTokenizer[] sentences, String writtenSentence) {

        for (int i = 0; i < parrotsNum; i++) {
            wordsToIndex.put(sentences[i].nextToken(), i);
        }

        StringTokenizer st = new StringTokenizer(writtenSentence);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (wordsToIndex.containsKey(word)) {
                int index = wordsToIndex.get(word);
                if (sentences[index].hasMoreTokens()) {
                    wordsToIndex.put(sentences[index].nextToken(), index);
                }
                wordsToIndex.remove(word);
            } else {
                return false;
            }
        }

        return !st.hasMoreTokens() && wordsToIndex.size() == 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int parrotsNum = Integer.parseInt(br.readLine());

        HashMap<String, Integer> wordsToIndex = new HashMap<>();
        StringTokenizer[] sentences = new StringTokenizer[parrotsNum];

        // set sentences
        for (int i = 0; i < parrotsNum; i++) {
            sentences[i] = new StringTokenizer(br.readLine());
        }

        System.out.println(isPossible(parrotsNum, wordsToIndex, sentences, br.readLine()) ? "Possible" : "Impossible");
    }
}
