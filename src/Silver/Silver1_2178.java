package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver1_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int[][] maze = new int[height][width];

        for (int h = 0; h < height; h++) {
            String input = br.readLine();
            for (int w = 0; w < width; w++) {
                maze[h][w] = input.charAt(w) - '0';
            }
        }

        System.out.println(bfs(maze, height, width, 0, 0));
    }

    public static int bfs(int[][] arr, int height, int width, int h, int w) {
        Queue<Integer> heightQueue = new ArrayDeque<>();
        Queue<Integer> widthQueue = new ArrayDeque<>();

        heightQueue.offer(h);
        widthQueue.offer(w);

        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};

        while (!heightQueue.isEmpty() && !widthQueue.isEmpty()) {
            h = heightQueue.poll();
            w = widthQueue.poll();
            for (int i = 0; i < 4; i++) {
                int nowH = h + dh[i];
                int nowW = w + dw[i];

                if (nowH <= -1 || nowW <= -1 || nowH >= height || nowW >= width) {
                    continue;
                }
                if (arr[nowH][nowW] == 0) {
                    continue;
                }
                if (arr[nowH][nowW] == 1) {
                    arr[nowH][nowW] = arr[h][w] + 1;
                    heightQueue.offer(nowH);
                    widthQueue.offer(nowW);
                }
            }
        }
        return arr[height - 1][width - 1];
    }
}
