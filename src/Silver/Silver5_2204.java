package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int wordsNum = Integer.parseInt(br.readLine());
            if (wordsNum == 0) break;

            String result = br.readLine();
            while (wordsNum-- > 1) {
                String temp = br.readLine();
                if (result.compareToIgnoreCase(temp) > 0) {
                    result = temp;
                }
            }

            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}
