package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold1_2014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] primeNumbers = new long[K];
        PriorityQueue<Long> mulPrimes = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            primeNumbers[i] = Integer.parseInt(st.nextToken());
        }

        for (long prime : primeNumbers) {
            mulPrimes.offer(prime);
        }

        while (N-- > 1) {
            long number = mulPrimes.poll();

            for (long prime : primeNumbers) {
                mulPrimes.offer(number * prime);
                if (number % prime == 0) break;
            }
        }
        System.out.println(mulPrimes.peek());
    }
}