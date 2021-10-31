package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_1811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] ground = new int[N][M];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                int value = Integer.parseInt(st.nextToken());
                ground[i][j] = value;

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        int answerSeconds = Integer.MAX_VALUE; // 시간
        int answerHeight = -1; // 층

        for (int height = min; height <= max; height++) { // 최소층 부터 최대층 까지

            int seconds = 0;
            int inventory = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = ground[i][j] - height;

                    if (diff > 0) { // 제거해야 함
                        seconds += diff * 2;
                        inventory += diff;
                    } else if (diff < 0) { // 추가해야 함
                        seconds -= diff;
                        inventory += diff;
                    }
                }
            }

            if (inventory >= 0 && seconds <= answerSeconds) {   // == 가 포함되어야 함 그렇지 않으면 최대 높이를 판별 하지 못함
                answerSeconds = seconds;
                answerHeight = height;
            }
        }

        System.out.println(answerSeconds + " " + answerHeight);
    }
}
