package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 분자
        int B = Integer.parseInt(st.nextToken()); // 분모
        int N = Integer.parseInt(st.nextToken()); // 소수점 아래 N번째 자리수

        while (N-- > 0) {
            A = A % B;
            A = A * 10;
        }

        System.out.println(A / B);
    }
}
