package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold3_15711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testAmount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testAmount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            long num2 = Long.parseLong(st.nextToken());
            long sum = num1 + num2;
            if (sum == 2) {
                sb.append("NO\n");
            } else if (sum % 2 == 0) {
                sb.append("YES\n");
            } else {
                long nb = sum - 2;
                BigInteger bigInt = BigInteger.valueOf(nb);
                if (bigInt.isProbablePrime(10)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.println(sb);
    }
    /*static final int MAX_VALUE = 2000000;
    static boolean[] primeChecker;
    static ArrayList<Integer> primeNumber;

    public static void main(String[] args) throws IOException {
        primeChecker = new boolean[MAX_VALUE + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= MAX_VALUE; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX_VALUE; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        primeNumber = new ArrayList<>();
        for (int i = 2; i <= MAX_VALUE; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testAmount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testAmount; i++) {
            st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            long num2 = Long.parseLong(st.nextToken());
            long sum = num1 + num2;
            if (sum == 2 || sum == 3) {
                sb.append("NO\n");
            } else if (sum % 2 == 0) {
                sb.append("YES\n");
            } else {
                if (isPrime(sum - 2)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb);
    }

    public static boolean isPrime(long num) {
        for (int prime : primeNumber) {
            if ((long) prime * prime <= num && num % prime == 0) {
                return false;
            }
        }
        return true;
    }*/
}
