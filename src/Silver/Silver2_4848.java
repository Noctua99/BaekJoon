package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Silver2_4848 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] numbers = new String[16];
        numbers[0] = "{}";
        for (int i = 1; i <= 15; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append('{');
            for (int j = 0; j < i - 1; j++) {
                temp.append(numbers[j]).append(',');
            }
            temp.append(numbers[i - 1]).append('}');
            numbers[i] = String.valueOf(temp);
        }

        HashMap<String, Integer> setToNumber = new HashMap<>();
        for (int i = 0; i < 16; i++) {
            setToNumber.put(numbers[i], i);
        }

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            sb.append(numbers[setToNumber.get(br.readLine()) + setToNumber.get(br.readLine())]).append('\n');
        }

        System.out.println(sb);
    }
}
