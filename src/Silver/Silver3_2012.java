package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver3_2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentNum = Integer.parseInt(br.readLine());
        int[] scores = new int[studentNum + 1];

        for (int i = 1; i <= studentNum; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);

        long dissatisfaction = 0;
        for (int i = 1; i <= studentNum; i++) {
            dissatisfaction += Math.abs(scores[i] - i);
        }

        System.out.println(dissatisfaction);
    }
}
