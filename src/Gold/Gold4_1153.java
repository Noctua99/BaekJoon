package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Gold4_1153 {
    static boolean[] primeChecker;
    static int[] primeNumbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N <= 7) {
            System.out.println(-1);
        } else {
            setPrimeChecker(N);
            setPrimeNumbers(N);

            if (N % 2 == 0) {
                sb.append(2).append(" ").append(2).append(" ");
                N = N - 4;

            } else {
                sb.append(2).append(" ").append(3).append(" ");
                N = N - 5;
            }
            goldbach(N);
            System.out.println(sb);
        }
    }

    public static void setPrimeChecker(int N) {
        primeChecker = new boolean[N + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= N; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= N; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
    }

    public static void setPrimeNumbers(int N) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (primeChecker[i]) {
                tempList.add(i);
            }
        }
        primeNumbers = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            primeNumbers[i] = tempList.get(i);
        }
    }

    public static void goldbach(int N) {
        for (int number : primeNumbers) {
            for (int primeNumber : primeNumbers) {
                if (number + primeNumber == N) {
                    sb.append(number).append(" ").append(primeNumber);
                    return;
                }
            }
        }
    }
}
