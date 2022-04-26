package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_6603 {

    static int number;
    static int[] array;
    static int[] result = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int at, int depth) {
        if (depth == 6) {
            for (int value : result) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i < number; i++) {
            result[depth] = array[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            number = Integer.parseInt(st.nextToken());

            if (number == 0) {
                break;
            }

            array = new int[number];

            for (int i = 0; i < number; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
