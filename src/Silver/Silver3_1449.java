package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver3_1449 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int leakCount = Integer.parseInt(st.nextToken());
        int tapeLen = Integer.parseInt(st.nextToken());

        int[] leaks = new int[leakCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < leakCount; i++) {
            leaks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(leaks);

        int tapeCount = 0;

        int left = 0;
        int right = 1;
        while (right < leakCount) {
            if (leaks[right] - leaks[left] >= tapeLen) {
                tapeCount++;
                left = right;
            }
            right++;
        }

        System.out.println(tapeCount + 1);
    }
}
