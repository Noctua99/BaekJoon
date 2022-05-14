package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_5939 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTime = Integer.parseInt(br.readLine());

        int[][] times = new int[numOfTime][3];

        for (int i = 0; i < numOfTime; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                times[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(times, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                if (o1[1] == o2[1]) {
                    return o1[2] - o2[2];
                }
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        for (int[] time : times) {
            sb.append(time[0]).append(' ')
                    .append(time[1]).append(' ')
                    .append(time[2]).append('\n');
        }

        System.out.println(sb);
    }
}
