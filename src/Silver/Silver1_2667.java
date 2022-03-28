package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver1_2667 {

    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};
    static int[] houses;
    static int len;
    static int houseNum = 0;
    static int[][] map;
    static boolean[][] visited;

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        houses[houseNum]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < len && ny < len) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        len = Integer.parseInt(br.readLine());

        map = new int[len][len];
        visited = new boolean[len][len];
        houses = new int[len * len / 2 + 2];

        for (int i = 0; i < len; i++) {
            String input = br.readLine();
            for (int j = 0; j < len; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    houseNum++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(houses);

        StringBuilder sb = new StringBuilder();

        sb.append(houseNum).append('\n');

        for (int house : houses) {
            if (house != 0) {
                sb.append(house).append('\n');
            }
        }

        System.out.println(sb);
    }
}
