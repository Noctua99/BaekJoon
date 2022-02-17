package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_1629 {

    static int C = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B));
    }

    public static long pow(long A, long exp) {
        if(exp == 1) {
            return A % C;
        }

        long temp = pow(A, exp / 2);

        if(exp % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }
}
