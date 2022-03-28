package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_1012 {

    static int[] dx = new int[]{0, 0, -1, 1};
    static int[] dy = new int[]{-1, 1, 0, 0};
    static int horizontalLen;   // 가로 길이
    static int verticalLen; // 세로 길이
    static int[][] map; // 배추밭
    static boolean[][] visited; // 방문 여부
    static int minWormNum;  // 최소의 배추흰지렁이 마리 수

    public static void dfs(int y, int x) {
        // 현재 노드 방문 처리
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            // 인접한 노드가 map을 벗어나지 않고
            if (nx >= 0 && ny >= 0 && nx < horizontalLen && ny < verticalLen) {
                // 배추가 심어져 있으며 아직 방문하지 않았으면 탐색
                if (map[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(ny, nx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());  // 테스트 케이스의 개수

        while (testNum-- > 0) {
            // 테스트 케이스마다 최소의 배추흰지렁이 마리 수 초기화
            minWormNum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            horizontalLen = Integer.parseInt(st.nextToken());   // 가로 길이
            verticalLen = Integer.parseInt(st.nextToken()); // 세로 길이
            int cabbageNum = Integer.parseInt(st.nextToken());  // 배추의 개수

            map = new int[verticalLen][horizontalLen];
            visited = new boolean[verticalLen][horizontalLen];

            while (cabbageNum-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = 1;
            }

            for (int i = 0; i < horizontalLen; i++) {
                for (int j = 0; j < verticalLen; j++) {
                    if (map[j][i] == 1 && !visited[j][i]) {
                        minWormNum++;
                        dfs(j, i);
                    }
                }
            }

            sb.append(minWormNum).append('\n');
        }

        System.out.println(sb);
    }
}
