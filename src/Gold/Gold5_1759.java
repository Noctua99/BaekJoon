package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Gold5_1759 {

    static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    static int pwLen, alpNum;
    static char[] password, alphabets;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int at, int depth) {
        if (depth == pwLen) {
            if (isValidate(password)) {
                for (char val : password) {
                    sb.append(val);
                }
                sb.append('\n');
            }
            return;
        }

        for (int i = at; i < alpNum; i++) {
            password[depth] = alphabets[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static boolean isValidate(char[] password) {
        int vowelsNum = 0;

        for (char val : password) {
            if (vowels.contains(val)) {
                vowelsNum++;
            }
        }

        return vowelsNum >= 1 && vowelsNum <= (pwLen - 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        pwLen = Integer.parseInt(st.nextToken());   // 암호의 길이
        alpNum = Integer.parseInt(st.nextToken());  // 주어진 문자의 수

        password = new char[pwLen];
        alphabets = new char[alpNum];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < alpNum; i++) {
            alphabets[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(alphabets);

        dfs(0, 0);

        System.out.println(sb);
    }
}
