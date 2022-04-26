package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_15655 {

    static int N, M;
    static int[] array, result;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int at, int depth) {
        if (depth == M) {
            for (int value : result) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i < N; i++) {
            result[depth] = array[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        dfs(0, 0);

        System.out.println(sb);
    }
}
