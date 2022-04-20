package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold3_2904 {

    static int[] arr;
    static int max;
    static boolean[] isPrime;
    static HashMap<Integer, Integer> primeToNum = new HashMap<>();
    static ArrayList<Integer> primeFactors = new ArrayList<>();


    public static void setIsPrime() {
        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void setPrimeToNum() {
        for (int data : arr) {
            if (isPrime[data]) {
                primeToNum.put(data, primeToNum.getOrDefault(data, 0) + 1);
                continue;
            }
            while (data != 1) {
                for (int i = 2; i <= data; i++) {
                    if (isPrime[i] && data % i == 0) {
                        primeToNum.put(i, primeToNum.getOrDefault(i, 0) + 1);
                        data /= i;
                        break;
                    }
                }
            }
        }

        primeToNum.replaceAll((k, v) -> v / arr.length);
    }

    public static void setPrimeFactors() {
        for (Map.Entry<Integer, Integer> entry : primeToNum.entrySet()) {
            if (entry.getValue() != 0) {
                for (int i = 0; i < entry.getValue(); i++) {
                    primeFactors.add(entry.getKey());
                }
            }
        }
    }

    public static int findMaxScore() {
        int maxScore = 1;

        for (Map.Entry<Integer, Integer> entry : primeToNum.entrySet()) {
            maxScore *= Math.pow(entry.getKey(), entry.getValue());
        }

        return maxScore;
    }

    public static int findSmallestOperations() {
        int smallestOperations = 0;

        for (int data : arr) {
            for (int primeFactor : primeFactors) {
                if (data % primeFactor != 0) {
                    smallestOperations++;
                } else {
                    data /= primeFactor;
                }
            }
        }

        return smallestOperations;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());  // number of elements in the starting sequence
        arr = new int[num];

        // set Array
        max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(arr[i], max);
        }

        setIsPrime();
        setPrimeToNum();
        setPrimeFactors();

        System.out.println(findMaxScore() + " " + findSmallestOperations());
    }
}
