package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold5_14503 {
    static int direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 가로 길이
        int M = Integer.parseInt(st.nextToken());   // 세로 길이

        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());  // 현재 북쪽으로부터 떨어진 칸의 개수
        int x = Integer.parseInt(st.nextToken());  // 현재 서쪽으로부터 떨어진 칸의 개수
        visited[y][x] = true;

        direction = Integer.parseInt(st.nextToken());   // 바라보는 방향

        int[] dy = new int[]{-1, 0, 1, 0};
        int[] dx = new int[]{0, 1, 0, -1};

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 1;
        int turnTime = 0;
        while (true) {
            turnLeft();
            int ny = y + dy[direction];
            int nx = x + dx[direction];

            if (!visited[ny][nx] && map[ny][nx] == 0) {
                y = ny;
                x = nx;
                visited[y][x] = true;
                count++;
                turnTime = 0;
                continue;
            } else {
                turnTime++;
            }
            if (turnTime == 4) {
                ny = y - dy[direction];
                nx = x - dx[direction];
                if (map[ny][nx] == 0) {
                    y = ny;
                    x = nx;
                } else {
                    break;
                }
                turnTime = 0;
            }
        }
        System.out.println(count);
    }

    public static void turnLeft() {
        direction--;
        if (direction < 0) {
            direction = 3;
        }
    }
}
