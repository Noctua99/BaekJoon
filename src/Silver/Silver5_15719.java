package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_15719 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] existed = new boolean[N];
        int result = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            if (existed[num]) {
                result = num;
                break;
            } else {
                existed[num] = true;
            }
        }

        System.out.println(result);
    }
}
