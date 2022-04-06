package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_5637 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maxLenStr = "";

        Loop:
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ,;:.!?'\"/()[]*");
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (word.equals("E-N-D")) break Loop;

                maxLenStr = maxLenStr.length() >= word.length() ? maxLenStr : word;
            }
        }

        System.out.println(maxLenStr.toLowerCase());
    }
}
