package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver5_4775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        HashSet<String> directoryWords = new HashSet<>();

        int wordsNum = Integer.parseInt(br.readLine());
        while (wordsNum-- > 0) {
            directoryWords.add(br.readLine());
        }

        int emailsNum = Integer.parseInt(br.readLine());
        for (int i = 1; i <= emailsNum; i++) {
            boolean isCorrect = true;
            StringBuilder sb = new StringBuilder();

            while (true) {
                String word = br.readLine();
                if (word.equals("-1")) break;

                if (!directoryWords.contains(word)) {
                    isCorrect = false;
                    sb.append(word).append('\n');
                }
            }

            if (isCorrect) {
                result.append("Email ").append(i).append(" is spelled correctly.\n");
            } else {
                result.append("Email ").append(i).append(" is not spelled correctly.\n");
            }

            result.append(sb);
        }

        result.append("End of Output");

        System.out.println(result);
    }
}
