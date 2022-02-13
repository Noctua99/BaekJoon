package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isExisted = new boolean[2_000_000];

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            isExisted[Integer.parseInt(st.nextToken())] = true;
        }

        int X = Integer.parseInt(br.readLine());
        int count = 0;

        if (X % 2 == 0) {
            for (int i = 1; i < X / 2; i++) {
                if (isExisted[i] && isExisted[X - i]) {
                    count++;
                }
            }
        } else {
            for (int i = 1; i <= X / 2; i++) {
                if (isExisted[i] && isExisted[X - i]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
