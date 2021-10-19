package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Silver2_15965 {
    static final int MAX_SIZE = 7368787;

    public static void main(String[] args) throws IOException {
        boolean[] primeChecker = new boolean[MAX_SIZE + 1];
        Arrays.fill(primeChecker, true);
        for (int i = 2; i * i <= MAX_SIZE; i++) {
            if (primeChecker[i]) {
                for (int j = i * i; j <= MAX_SIZE; j += i) {
                    primeChecker[j] = false;
                }
            }
        }
        ArrayList<Integer> primeNumber = new ArrayList<>(500000);
        for (int i = 2; i <= MAX_SIZE; i++) {
            if (primeChecker[i]) {
                primeNumber.add(i);
            }
        }

        Integer[] primeArray = primeNumber.toArray(new Integer[500000]);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int primeIndex = Integer.parseInt(br.readLine());
        System.out.println(primeArray[primeIndex - 1]);
    }
}
