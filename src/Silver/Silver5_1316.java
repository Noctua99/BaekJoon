package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver5_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordNumber = Integer.parseInt(br.readLine());
        int result = wordNumber;
        for (int i = 0; i < wordNumber; i++) {
            boolean[] isOverlapped = new boolean[26];
            Arrays.fill(isOverlapped, true);

            String word = br.readLine();
            int wordLength = word.length();
            for (int j = 0; j < wordLength; j++) {
                int index = word.charAt(j) - 'a';
                if (isOverlapped[index]) {
                    isOverlapped[index] = false;
                } else {
                    if (word.charAt(j - 1) != word.charAt(j)) {
                        result--;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
