package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_1244 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int switchNum = Integer.parseInt(br.readLine());

        boolean[] switches = new boolean[switchNum + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= switchNum; i++) {
            if (st.nextToken().equals("1")) {
                switches[i] = true;
            }
        }

        int studentNum = Integer.parseInt(br.readLine());

        while (studentNum-- > 0) {
            st = new StringTokenizer(br.readLine());
            String gender = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (gender.equals("1")) {   // 남자
                for (int i = num; i <= switchNum; i += num) {
                    switches[i] = !switches[i];
                }
            } else {    // 여자
                int sameRange = 0;
                for (int i = 1; i <= Math.min(num - 1, switchNum - num); i++) {
                    if (switches[num - i] != switches[num + i]) {
                        break;
                    }

                    sameRange++;
                }

                switches[num] = !switches[num];
                for (int i = 1; i <= sameRange; i++) {
                    switches[num - i] = !switches[num - i];
                    switches[num + i] = !switches[num + i];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= switchNum; i++) {
            sb.append(switches[i] ? 1 : 0).append(' ');

            if (i % 20 == 0) sb.append('\n');
        }

        System.out.println(sb);
    }
}
