package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfLevel = Integer.parseInt(br.readLine());

        int[] levelArr = new int[numOfLevel];
        for (int i = 0; i < numOfLevel; i++) {
            levelArr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = numOfLevel - 1; i >= 1; i--) {
            if (levelArr[i - 1] >= levelArr[i]) {
                count += (levelArr[i - 1] - levelArr[i] + 1);
                levelArr[i - 1] = levelArr[i] - 1;
            }
        }

        System.out.println(count);
    }
}
