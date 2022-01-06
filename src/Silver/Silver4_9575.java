package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_9575 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            HashSet<Integer> luckyNum = new HashSet<>();

            int sizeOfA = Integer.parseInt(br.readLine());
            int[] A = new int[sizeOfA];

            setArr(A, sizeOfA);

            int sizeOfB = Integer.parseInt(br.readLine());
            int[] B = new int[sizeOfB];

            setArr(B, sizeOfB);

            int sizeOfC = Integer.parseInt(br.readLine());
            int[] C = new int[sizeOfC];

            setArr(C, sizeOfC);

            for (int a : A) {
                for (int b : B) {
                    for (int c : C) {
                        int sum = a + b + c;
                        if (isLuckyNum(sum)) {
                            luckyNum.add(sum);
                        }
                    }
                }
            }

            sb.append(luckyNum.size()).append('\n');
        }

        System.out.println(sb);
    }

    public static void setArr(int[] arr, int len) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static boolean isLuckyNum(int num) {
        while (num % 10 == 5 || num % 10 == 8) {
            num /= 10;
        }
        return num == 0;
    }
}
