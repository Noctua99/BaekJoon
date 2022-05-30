package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1459 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());   // 집의 X좌표
        long Y = Long.parseLong(st.nextToken());   // 집의 Y좌표
        long W = Long.parseLong(st.nextToken());   // 걸어서 한 블록 가는데 걸리는 시
        long S = Long.parseLong(st.nextToken());   // 대각선으로 한 블록을 가로지르는 시간

        long time;

        if (W * 2 <= S) {
            time = (X + Y) * W;
        } else {
            long min = Math.min(X, Y);
            if (W < S) {
                time = (X + Y - min * 2) * W + min * S;
            } else {
                if ((X + Y - min * 2) % 2 == 1) {
                    time = (X + Y - min - 1) * S + W;
                } else {
                    time = (X + Y - min) * S;
                }
            }
        }

        System.out.println(time);
    }
}
