package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Silver5_10689 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        int[] problems = new int[100_001];
        Set<Integer> probSet = new HashSet<>();

        for (int i = 1; i <= testNum; i++) {
            int probNum = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < probNum; j++) {
                int prob = Integer.parseInt(st.nextToken());
                problems[j] = prob;
                probSet.add(prob);
            }

            for (int j = 0; j < probNum; j++) {
                probSet.remove(problems[j]);

                if (probSet.isEmpty()) {
                    sb.append("Case ").append(i).append(": ").append(j + 1).append('\n');
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
