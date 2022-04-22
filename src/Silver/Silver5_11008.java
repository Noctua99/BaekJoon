package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_11008 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testsNum = Integer.parseInt(br.readLine());

        while (testsNum-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append(st.nextToken().replaceAll(st.nextToken(), " ").length()).append('\n');
        }

        System.out.println(sb);
    }
}
