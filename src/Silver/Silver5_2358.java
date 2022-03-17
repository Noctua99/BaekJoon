package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver5_2358 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> xToNum = new HashMap<>();
        HashMap<Integer, Integer> yToNum = new HashMap<>();
        int numOfCoordinates = Integer.parseInt(br.readLine());

        while (numOfCoordinates-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xToNum.put(x, xToNum.getOrDefault(x, 0) + 1);
            yToNum.put(y, yToNum.getOrDefault(y, 0) + 1);
        }

        int count = 0;

        for (int value : xToNum.values()) {
            if (value >= 2) {
                count++;
            }
        }

        for (int value : yToNum.values()) {
            if (value >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
