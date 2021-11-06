package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Silver1_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int carCount = Integer.parseInt(br.readLine());

        HashMap<String, Integer> carsIn = new HashMap<>();
        for (int i = 0; i < carCount; i++) {
            carsIn.put(br.readLine(), i);
        }

        int[] carsOut = new int[carCount];
        for (int i = 0; i < carCount; i++) {
            carsOut[i] = carsIn.get(br.readLine());
        }

        int overtakeCarCount = 0;
        for (int i = 0; i < carCount; i++) {
            for (int j = i + 1; j < carCount; j++) {
                if (carsOut[i] > carsOut[j]) {
                    overtakeCarCount++;
                    break;
                }
            }
        }

        System.out.println(overtakeCarCount);
    }
}
