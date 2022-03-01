package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_14582 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isFlipped(br.readLine(), br.readLine()) ? "Yes" : "No");
    }

    public static boolean isFlipped(String input1, String input2) {
        StringTokenizer st1 = new StringTokenizer(input1);
        StringTokenizer st2 = new StringTokenizer(input2);

        int totalScore = 0;
        boolean wasThereWinningMoment = false;

        for (int i = 0; i < 9; i++) {
            totalScore += Integer.parseInt(st1.nextToken());
            if (totalScore > 0) {
                wasThereWinningMoment = true;
            }
            totalScore -= Integer.parseInt(st2.nextToken());
        }

        return wasThereWinningMoment && totalScore < 0;
    }
}
