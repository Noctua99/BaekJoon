package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver1_3557 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> numToFreq = new HashMap<>();
        int insertCount = 0;
        int deleteCount = 0;

        int numOfOperations = Integer.parseInt(br.readLine());
        while (numOfOperations-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char operation = st.nextToken().charAt(0);
            int argument = Integer.parseInt(st.nextToken());

            if (operation == 'i') {
                insertCount++;
                numToFreq.put(argument, numToFreq.getOrDefault(argument, 0) + 1);
            } else {
                if (numToFreq.containsKey(argument)) {
                    deleteCount++;

                    if (numToFreq.get(argument) == 1) {
                        numToFreq.remove(argument);
                    } else {
                        numToFreq.put(argument, numToFreq.get(argument) - 1);
                    }
                }
            }

            boolean isHeterogeneous = numToFreq.size() >= 2;
            boolean isHomogeneous = (insertCount - deleteCount) > numToFreq.size();

            if (isHeterogeneous) {
                sb.append(isHomogeneous ? "both\n" : "hetero\n");
            } else {
                sb.append(isHomogeneous ? "homo\n" : "neither\n");
            }
        }

        System.out.println(sb);
    }
}
