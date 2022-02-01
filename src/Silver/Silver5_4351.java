package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver5_4351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> hayPointDict = new HashMap<>();    // Hay Point dictionary

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfWords = Integer.parseInt(st.nextToken());
        int numOfDesc = Integer.parseInt(st.nextToken());

        while (numOfWords-- > 0) {
            st = new StringTokenizer(br.readLine());
            hayPointDict.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        while (numOfDesc-- > 0) {
            int point = 0;
            while (true) {
                String line = br.readLine();
                if (line.equals(".")) break;

                st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    if (hayPointDict.containsKey(word)) {
                        point += hayPointDict.get(word);
                    }
                }
            }
            sb.append(point).append('\n');
        }

        System.out.println(sb);
    }
}
