package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> cries = new HashSet<>();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            String recording = br.readLine();
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (st.nextToken().equals("what")) break;
                st.nextToken();
                cries.add(st.nextToken());
            }
            StringTokenizer st = new StringTokenizer(recording);
            while (st.hasMoreTokens()) {
                String cry = st.nextToken();
                if (!cries.contains(cry)) {
                    sb.append(cry).append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
