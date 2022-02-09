package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver5_5608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Character> converter = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            converter.put(st.nextToken().charAt(0), st.nextToken().charAt(0));
        }

        int m = Integer.parseInt(br.readLine());
        char[] charArray = new char[m];
        for (int i = 0; i < m; i++) {
            charArray[i] = br.readLine().charAt(0);
            if (converter.containsKey(charArray[i])) {
                charArray[i] = converter.get(charArray[i]);
            }
        }

        System.out.println(charArray);
    }
}
