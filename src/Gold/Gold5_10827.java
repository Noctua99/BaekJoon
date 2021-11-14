package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Gold5_10827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        BigDecimal base = new BigDecimal(st.nextToken());
        int power = Integer.parseInt(st.nextToken());

        System.out.println(base.pow(power).toPlainString());
    }
}
