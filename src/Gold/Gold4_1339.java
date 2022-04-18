package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold4_1339 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alpha = new int[26];

        int wordsNum = Integer.parseInt(br.readLine());

        while (wordsNum-- > 0) {
            String word = br.readLine();
            int len = word.length();

            for (int i = 0; i < len; i++) {
                alpha[word.charAt(i) - 'A'] += Math.pow(10, len - i - 1);
            }
        }

        Arrays.sort(alpha);

        int maxSum = 0;
        int num = 9;

        for (int i = 25; i >= 0; i--) {
            if (alpha[i] == 0) break;

            maxSum += alpha[i] * num--;
        }

        System.out.println(maxSum);
    }
}
