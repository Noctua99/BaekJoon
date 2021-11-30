package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Silver1_3896 {
    static boolean[] primeChecker;
    static int[] results;
    static final int MAX = 1_299_709;

    public static void main(String[] args) throws IOException {
        setPrimeChecker();
        setResults();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            sb.append(results[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX + 1];
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

    public static void setResults() {
        results = new int[MAX + 1];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2; i <= MAX; i++) {
            if (primeChecker[i]) {
                int len = stack.size() + 1;
                while (!stack.isEmpty()) {
                    results[stack.pop()] = len;
                }
                results[i] = 0;
            } else {
                stack.push(i);
            }
        }
    }
}
