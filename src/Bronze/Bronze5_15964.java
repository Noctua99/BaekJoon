package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze5_15964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(
                (long) (Math.pow(Integer.parseInt(st.nextToken()), 2) - Math.pow(Integer.parseInt(st.nextToken()), 2))
        );
    }
}
