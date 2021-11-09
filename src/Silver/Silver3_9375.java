package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver3_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        HashMap<String, Integer> items;
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            items = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String item = st.nextToken();
                if (items.containsKey(item)) {
                    items.put(item, items.get(item) + 1);
                } else {
                    items.put(item, 1);
                }
            }
            int result = 1;

            for (int value : items.values()) {
                result *= (value + 1);
            }
            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
    }
}
