package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Silver2_15665 {

    static int N, M;
    static int[] array, result;
    static Set<String> set = new LinkedHashSet<>();

    public static void dfs(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int value : result) {
                sb.append(value).append(' ');
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            result[depth] = array[i];
            dfs(depth + 1);
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

        dfs(0);

        StringBuilder sb = new StringBuilder();

        for (String s : set) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
