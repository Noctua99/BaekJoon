package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testAmount = Integer.parseInt(br.readLine());

        int[] weights = new int[testAmount];
        int[] heights = new int[testAmount];

        for (int t = 0; t < testAmount; t++) {
            st = new StringTokenizer(br.readLine());
            weights[t] = Integer.parseInt(st.nextToken());
            heights[t] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testAmount; i++) {
            int rank = testAmount + 1;
            for (int j = 0; j < testAmount; j++) {
                if (weights[i] >= weights[j] || heights[i] >= heights[j])
                    rank--;
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}