package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_11116 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        for (int t = 1; t <= numOfTests; t++) {
            int numOfProd = Integer.parseInt(br.readLine());

            int[] prices = new int[numOfProd * 2];
            boolean[] visit = new boolean[numOfProd * 2];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numOfProd * 2; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("Case #").append(t).append(": ");
            for (int i = 0; i < numOfProd * 2; i++) {
                if (!visit[i]) {
                    for (int j = i + 1; j < numOfProd * 2; j++) {
                        if (prices[j] == (prices[i] / 3 * 4) && !visit[j]) {
                            visit[j]=true;
                            break;
                        }
                    }

                    sb.append(prices[i]).append(" ");
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
