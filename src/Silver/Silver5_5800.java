package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfClass = Integer.parseInt(br.readLine());
        for (int i = 1; i <= numOfClass; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfStud = Integer.parseInt(st.nextToken());
            int[] scores = new int[numOfStud];

            for (int j = 0; j < numOfStud; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores);

            int max = scores[numOfStud - 1];
            int min = scores[0];
            int maxDiff = 0;

            for (int j = 0; j < numOfStud - 1; j++) {
                maxDiff = Math.max(maxDiff, scores[j + 1] - scores[j]);
            }

            sb.append("Class ").append(i).append('\n');
            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(maxDiff).append('\n');
        }

        System.out.println(sb);
    }
}
