package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver5_11101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testsNum = Integer.parseInt(br.readLine());

        while (testsNum-- > 0) {
            HashMap<String, Integer> criteriaToCost = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine(), ":,");
            while (st.hasMoreTokens()) {
                criteriaToCost.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }

            int totalMinCost = Integer.MAX_VALUE;
            int maxCost = Integer.MIN_VALUE;

            st = new StringTokenizer(br.readLine(), "|");
            while (st.hasMoreTokens()) {
                StringTokenizer st1 = new StringTokenizer(st.nextToken(), "&");
                while (st1.hasMoreTokens()) {
                    maxCost = Math.max(criteriaToCost.get(st1.nextToken()), maxCost);
                }

                totalMinCost = Math.min(maxCost, totalMinCost);
                maxCost = 0;
            }

            sb.append(totalMinCost).append('\n');
        }

        System.out.println(sb);
    }
}
