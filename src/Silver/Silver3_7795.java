package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_7795 {

    public static int findNumOfPairs(int[] arrA, int[] arrB) {

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int numOfPairs = 0;
        int pointerA = arrA.length - 1;
        int pointerB = arrB.length - 1;

        while (pointerA >= 0 && pointerB >= 0) {
            if (arrA[pointerA] > arrB[pointerB]) {
                numOfPairs += (pointerB + 1);
                pointerA--;
            } else {
                pointerB--;
            }
        }

        return numOfPairs;
    }

    public static void setArr(int[] arr, StringTokenizer st, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());

        while (numOfTests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sizeOfA = Integer.parseInt(st.nextToken());
            int sizeOfB = Integer.parseInt(st.nextToken());

            int[] arrA = new int[sizeOfA];
            int[] arrB = new int[sizeOfB];

            setArr(arrA, new StringTokenizer(br.readLine()), sizeOfA);
            setArr(arrB, new StringTokenizer(br.readLine()), sizeOfB);

            sb.append(findNumOfPairs(arrA, arrB)).append('\n');
        }

        System.out.println(sb);
    }
}
