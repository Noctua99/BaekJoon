package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_20551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numOfElements = Integer.parseInt(st.nextToken());
        int numOfQuestions = Integer.parseInt(st.nextToken());

        int[] numbers = new int[numOfElements];
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numOfElements; i++) {
            int input = Integer.parseInt(br.readLine());
            numbers[i] = input;
            numberSet.add(input);
        }

        Arrays.sort(numbers);

        while (numOfQuestions-- > 0) {
            int key = Integer.parseInt(br.readLine());
            if (numberSet.contains(key)) {
                sb.append(binarySearch(numbers, key)).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length;
        while (first < last) {
            int mid = (first + last) / 2;
            if (arr[mid] >= key) {
                last = mid;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}