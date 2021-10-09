package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Gold3_14622 {
    static boolean[] primeNumber = new boolean[5000000];
    static boolean[] existedPrime = new boolean[5000000];
    static long relativeScore = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Arrays.fill(primeNumber, true);
        Arrays.fill(existedPrime, true);

        sieveOfEratosthenes();

        int testcase = Integer.parseInt(br.readLine());

        ArrayList<Integer> daewoongPrime = new ArrayList<>();
        ArrayList<Integer> gyuseongPrime = new ArrayList<>();

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int daewoong = Integer.parseInt(st.nextToken());
            int gyuseong = Integer.parseInt(st.nextToken());

            calculateScore(daewoong, daewoongPrime, gyuseongPrime, 1);
            calculateScore(gyuseong, gyuseongPrime, daewoongPrime, -1);
        }

        if (relativeScore > 0) {
            System.out.println("소수의 신 갓대웅");
        } else if (relativeScore < 0) {
            System.out.println("소수 마스터 갓규성");
        } else {
            System.out.println("우열을 가릴 수 없음");
        }
    }

    public static void sieveOfEratosthenes() {
        primeNumber[0] = false;
        primeNumber[1] = false;

        for (int i = 2; i * i <= 5000000; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j < 5000000; j += i) {
                    primeNumber[j] = false;
                }
            }
        }
    }

    public static void calculateScore(int input, ArrayList<Integer> myPrime, ArrayList<Integer> yourPrime, long sign) {
        if (primeNumber[input]) {  // 소수인가?
            if (existedPrime[input]) {   // 지금까지 등장하지 않았나?
                myPrime.add(input);
                if (myPrime.size() >= 4) {
                    myPrime.sort(Comparator.naturalOrder());
                    myPrime.remove(0);
                }
                existedPrime[input] = false;
            } else {
                relativeScore -= 1000 * sign;
            }
        } else {
            if (yourPrime.size() >= 3) {   // 상대방이 지금까지 말한 소수가 3개 이상인가?
                relativeScore -= yourPrime.get(0) * sign;
            } else {
                relativeScore -= 1000 * sign;
            }
        }
    }
}