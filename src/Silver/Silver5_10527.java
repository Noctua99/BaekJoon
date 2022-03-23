package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Silver5_10527 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfSub = Integer.parseInt(br.readLine());

        HashMap<String, Integer> resultToNum = new HashMap<>();

        for (int i = 0; i < numOfSub; i++) {
            String result = br.readLine();
            resultToNum.put(result, resultToNum.getOrDefault(result, 0) + 1);
        }

        int maxNum = 0;
        for (int i = 0; i < numOfSub; i++) {
            String result = br.readLine();
            if (resultToNum.containsKey(result)) {
                if (resultToNum.get(result) == 1) {
                    resultToNum.remove(result);
                } else {
                    resultToNum.put(result, resultToNum.get(result) - 1);
                }
                maxNum++;
            }
        }

        System.out.println(maxNum);
    }
}
