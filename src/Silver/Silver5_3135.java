package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_3135 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int diff = Math.abs(target - start) - 1;

        int numOfFreq = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfFreq; i++) {
            diff = Math.min(diff, Math.abs(target - Integer.parseInt(br.readLine())));
        }

        System.out.println(diff + 1);
    }
}
