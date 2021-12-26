package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver2_16112 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numOfQuest = Integer.parseInt(st.nextToken());
        int maxArcaneStones = Integer.parseInt(st.nextToken());

        int[] exp = new int[numOfQuest];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfQuest; i++) {
            exp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(exp);

        long[] expSum = new long[numOfQuest];
        expSum[numOfQuest - 1] = exp[numOfQuest - 1];
        for (int i = 2; i < numOfQuest; i++) {
            expSum[numOfQuest - i] = expSum[numOfQuest - i + 1] + exp[numOfQuest - i];
        }

        long maxExp = 0;

        if (numOfQuest <= maxArcaneStones) {
            maxArcaneStones = numOfQuest - 1;
        }

        for (int i = 1; i <= maxArcaneStones; i++) {
            maxExp += expSum[i];
        }

        System.out.println(maxExp);
    }
}
