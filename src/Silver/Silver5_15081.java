package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Silver5_15081 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> pickedApp = new HashSet<>();

        int kidCount = Integer.parseInt(br.readLine());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (kidCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int appCount = Integer.parseInt(st.nextToken());

            while (appCount-- > 0) {
                String app = st.nextToken();

                if (!pickedApp.contains(app)) {
                    pickedApp.add(app);
                    sb.append(app).append(' ');
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
