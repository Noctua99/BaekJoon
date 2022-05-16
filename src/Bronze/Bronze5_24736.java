package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze5_24736 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] scores = new int[]{6, 3, 2, 1, 2};

        for (int i = 0; i < 2; i++) {
            int totalScore = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                totalScore += scores[j] * Integer.parseInt(st.nextToken());
            }

            sb.append(totalScore).append(" ");
        }

        System.out.println(sb);
    }
}
