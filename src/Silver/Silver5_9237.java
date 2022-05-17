package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_9237 {

    static int[] seedlings;

    public static int findEarliestDay(int numOfSeedlings) {
        Arrays.sort(seedlings);

        int earliestDay = Integer.MIN_VALUE;

        for (int i = 0; i < numOfSeedlings; i++) {
            earliestDay = Math.max(seedlings[i] + numOfSeedlings + 1 - i, earliestDay);
        }

        return earliestDay;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfSeedlings = Integer.parseInt(br.readLine());

        seedlings = new int[numOfSeedlings];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfSeedlings; i++) {
            seedlings[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findEarliestDay(numOfSeedlings));
    }
}
