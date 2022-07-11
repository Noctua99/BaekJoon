package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1205 {

    static int scoreCount;  // 리스트에 있는 점수의 개수
    static int scoreT;  // 태수의 새로운 점수
    static int rankLimit;   // 랭킹 리스트에 올라갈 수 있는 점수의 개수
    static int[][] scores;

    public static int findRank() {
        if (scoreCount > 0) {
            if (scoreCount == rankLimit && scores[0][scoreCount - 1] >= scoreT) {
                return -1;
            }

            scores[1][0] = 1;
            for (int i = 1; i < scoreCount; i++) {
                if (scores[0][i] == scores[0][i - 1]) {
                    scores[1][i] = scores[1][i - 1];
                } else {
                    scores[1][i] = i + 1;
                }
            }

            for (int i = 0; i < scoreCount; i++) {
                if (scoreT >= scores[0][i]) {
                    return i + 1;
                }
            }

            return scoreCount + 1;
        }

        return 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        scoreCount = Integer.parseInt(st.nextToken());  // 리스트에 있는 점수의 개수
        scoreT = Integer.parseInt(st.nextToken());  // 태수의 새로운 점수
        rankLimit = Integer.parseInt(st.nextToken());   // 랭킹 리스트에 올라갈 수 있는 점수의 개수

        scores = new int[2][scoreCount];

        if (scoreCount > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < scoreCount; i++) {
                scores[0][i] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(findRank());
    }
}
