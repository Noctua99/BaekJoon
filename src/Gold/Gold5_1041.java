package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold5_1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 정육면체 한 변의 길이

        int[] dice = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < 6; i++) {
                sum += dice[i];
                max = Math.max(max, dice[i]);
            }
            System.out.println(sum - max);
        } else {
            int twoMin = Integer.MAX_VALUE;     // 두 면의 최소합
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (i + j == 5) continue;   //  마주보는 면은 제외
                    twoMin = Math.min(twoMin, dice[i] + dice[j]);
                }
            }

            int threeMin = Integer.MAX_VALUE;   // 세 면의 최소합
            for (int i = 1; i < 4; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (i + j == 5) continue;   // 마주보는 면은 제외
                    threeMin = Math.min(threeMin, dice[i] + dice[j]);
                }
            }
            threeMin = Math.min(threeMin + dice[0], threeMin + dice[5]);

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                min = Math.min(min, dice[i]);
            }

            long totalNumber = (long) Math.pow(N, 2) * 5;
            int threeCount = 4;
            int twoCount = (N - 2) * 4 + (N - 1) * 4;
            long oneCount = totalNumber - threeCount * 3 - twoCount * 2;
            long sum = threeMin * threeCount + twoMin * twoCount + min * oneCount;

            System.out.println(sum);
        }
    }
}
