package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_10709 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());   // height
        int w = Integer.parseInt(st.nextToken());   // width

        int[][] arr = new int[h][w];

        for (int i = 0; i < h; i++) {
            String input = br.readLine();
            for (int j = 0; j < w; j++) {
                if (input.charAt(j) != 'c') {
                    arr[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (arr[i][j - 1] != -1 && arr[i][j] != 0) {
                    arr[i][j] = arr[i][j - 1] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int[] tempArr : arr) {
            for (int data : tempArr) {
                sb.append(data).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
