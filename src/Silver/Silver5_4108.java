package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_4108 {

    static final int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
    static final int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (R == 0) break;

            boolean[][] isThereMine = new boolean[R][C];
            int[][] map = new int[R][C];

            for (int i = 0; i < R; i++) {
                String input = br.readLine();
                for (int j = 0; j < C; j++) {
                    if (input.charAt(j) == '*') {
                        isThereMine[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (isThereMine[i][j]) {
                        for (int k = 0; k < 8; k++) {
                            int ny = i + dy[k];
                            int nx = j + dx[k];
                            if (ny >= 0 && ny < R && nx >= 0 && nx < C) {
                                map[ny][nx]++;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (isThereMine[i][j]) {
                        sb.append('*');
                    } else {
                        sb.append(map[i][j]);
                    }
                }
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}
