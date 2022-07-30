package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2_2864 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        sb.append(Integer.parseInt(s1.replaceAll("6", "5")) + Integer.parseInt(s2.replaceAll("6", "5")))
                .append(' ')
                .append(Integer.parseInt(s1.replaceAll("5", "6")) + Integer.parseInt(s2.replaceAll("5", "6")));

        System.out.println(sb);
    }
}
