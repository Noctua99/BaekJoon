package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver2_10434 {
    static final int MAX = 10_000;
    static boolean[] primeChecker = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        setPrimeChecker();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(" ");
            int num = Integer.parseInt(st.nextToken());
            sb.append(num).append(" ");
            if (primeChecker[num] && isHappyNum(num)) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static boolean isHappyNum(int num) {
        boolean[] isLooped = new boolean[325];
        while (true) {
            int sum = 0;
            while (num != 0) {
                sum += Math.pow(num % 10, 2);
                num /= 10;
            }
            if (sum == 1) {
                return true;
            } else if (isLooped[sum]) {
                return false;
            } else {
                isLooped[sum] = true;
                num = sum;
            }
        }
    }
}
