package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_16435 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfFruits = Integer.parseInt(st.nextToken());
        int initialLength = Integer.parseInt(st.nextToken());

        int[] fruits = new int[numOfFruits];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfFruits; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findMaxLength(initialLength, fruits));
    }

    public static int findMaxLength(int currentLength, int[] fruits) {
        Arrays.sort(fruits);

        for (int fruit : fruits) {
            if (currentLength >= fruit) {
                currentLength++;
            } else {
                break;
            }
        }

        return currentLength;
    }
}
