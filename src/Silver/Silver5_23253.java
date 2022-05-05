package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_23253 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int M = Integer.parseInt(st.nextToken());   // 교과서 더미의 수

        String result = "Yes";

        loop:
        while (M-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int prev = Integer.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            while (k-- > 0) {
                int curr = Integer.parseInt(st.nextToken());

                if (prev > curr) {
                    prev = curr;
                } else {
                    result = "No";
                    break loop;
                }
            }
        }

        System.out.println(result);
    }
}
