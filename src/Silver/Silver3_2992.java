package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Silver3_2992 {

    static int len;
    static int[] array, result;
    static boolean[] visit;
    static TreeSet<Integer> set = new TreeSet<>();

    public static void dfs(int depth) {
        if (depth == len) {
            StringBuilder sb = new StringBuilder();
            for (int value : result) {
                sb.append(value);
            }
            set.add(Integer.parseInt(sb.toString()));
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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int num = Integer.parseInt(input);
        len = input.length();

        array = new int[len];
        result = new int[len];
        visit = new boolean[len];

        for (int i = 0; i < len; i++) {
            array[i] = input.charAt(i) - '0';
        }

        dfs(0);

        int result = 0;
        if (set.last() != num) {
            result = set.higher(num);
        }

        System.out.println(result);
    }
}
