package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver2_15067 {
    static boolean[] primeChecker;
    static final int MAX = 10_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        setPrimeChecker();

        while (true) {
            String licensePlate = br.readLine();
            if (licensePlate.equals("END 0000")) {
                break;
            }
            st = new StringTokenizer(licensePlate);
            String letters = st.nextToken();
            int digits = Integer.parseInt(st.nextToken());

            while (!primeChecker[digits]) {
                digits++;
                if (digits >= 10000) {
                    digits = 2;
                    letters = increaseString(letters);
                }
            }
            sb.append(letters).append(" ").append(String.format("%04d", digits)).append('\n');
        }
        System.out.println(sb);
    }

    public static void setPrimeChecker() {
        primeChecker = new boolean[MAX];
        Arrays.fill(primeChecker, true);
        primeChecker[0] = primeChecker[1] = false;
        for (int i = 2; i * i < MAX; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static String increaseString(String input) {
        char[] arr = input.toCharArray();
        if (arr[2] == 'Z') {
            if (arr[1] == 'Z') {
                arr[1] = arr[2] = 'A';
                arr[0]++;
            } else {
                arr[2] = 'A';
                arr[1]++;
            }
        } else {
            arr[2]++;
        }
        return String.valueOf(arr);
    }
}
