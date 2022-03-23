package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_14912 {

    public static int findFreqOfDigit(int n, int d) {
        int freqOfDigit = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num != 0) {
                int r = num % 10;
                if (r == d) {
                    freqOfDigit++;
                }
                num /= 10;
            }
        }

        return freqOfDigit;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(findFreqOfDigit(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}
