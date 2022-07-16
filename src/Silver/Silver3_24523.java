package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_24523 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int prev = Integer.parseInt(st.nextToken());
        int count = 1;

        for (int i = 2; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == prev) {
                count++;
            } else {
                while (count-- > 0) {
                    sb.append(i).append(' ');
                }
                count = 1;
                prev = num;
            }
        }

        while (count-- > 0) {
            sb.append(-1).append(' ');
        }


        System.out.println(sb);
    }
}
