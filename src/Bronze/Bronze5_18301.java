package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze5_18301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(
                (Integer.parseInt(st.nextToken()) + 1) *
                        (Integer.parseInt(st.nextToken()) + 1) /
                        (Integer.parseInt(st.nextToken()) + 1) - 1
        );
    }
}
