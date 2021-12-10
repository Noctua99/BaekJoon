package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Silver3_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int fileAmount = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> extensionCount = new TreeMap<>();
        while (fileAmount-- > 0) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String extension = st.nextToken();
            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }

        for (String extension : extensionCount.keySet()) {
            sb.append(extension).append(" ").append(extensionCount.get(extension)).append('\n');
        }
        System.out.println(sb);
    }
}
