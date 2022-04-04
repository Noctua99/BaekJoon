package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bronze1_18679 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> dictionary = new HashMap<>();

        int wordNumInDict = Integer.parseInt(br.readLine());    // the number of words in the dictionary (1 ≤ N ≤ 100)

        while (wordNumInDict-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " =");
            dictionary.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        while (testNum-- > 0) {
            int wordNum = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (wordNum-- > 0) {
                sb.append(dictionary.get(st.nextToken())).append(' ');
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
