package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_9742 {

    static char[] array, result;
    static boolean[] visit;
    static int len, count, target;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth) {
        if (depth == len) {
            if (count == target) {
                sb.append(result).append('\n');
            }
            count++;
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = array[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }

    public static int factorial(int n) {
        int returnValue = 1;

        for (int i = 2; i <= n; i++) {
            returnValue *= i;
        }

        return returnValue;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            array = st.nextToken().toCharArray();
            target = Integer.parseInt(st.nextToken());
            len = array.length;

            sb.append(input).append(" = ");

            if (target > factorial(len)) {
                sb.append("No permutation\n");
                continue;
            }

            result = new char[len];
            visit = new boolean[len];
            count = 1;

            Arrays.sort(array);

            dfs(0);
        }

        System.out.println(sb);
    }
}
