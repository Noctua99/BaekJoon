package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_9872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<HashSet<String>, Integer> occuCount = new HashMap<>();

        int numOfHours = Integer.parseInt(br.readLine());
        while (numOfHours-- > 0) {
            HashSet<String> group = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                group.add(st.nextToken());
            }
            occuCount.put(group, occuCount.getOrDefault(group, 0) + 1);
        }

        int max = 0;
        for (int count : occuCount.values()) {
            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
