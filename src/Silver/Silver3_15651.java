package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_15651 {

    static int N, M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth) {
        if (depth == M) {
            for (int value : result) {
                sb.append(value).append(' ');
            }
            sb.append('\n');

            return;
        }

        for (int i = 1; i <= N; i++) {
            result[depth] = i;
            dfs(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];

        dfs(0);

        System.out.println(sb);
    }
}
