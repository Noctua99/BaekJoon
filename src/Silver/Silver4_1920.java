package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int arrLength = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int loop = 0; loop < arrLength; loop++) {
            set.add(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int testAmount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int t = 0; t < testAmount; t++) {
            String testcase = st.nextToken();
            if (set.contains(testcase)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}
