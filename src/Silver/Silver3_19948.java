package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_19948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String poetry = br.readLine();
        int remainSpace = Integer.parseInt(br.readLine());
        String remainAlp = br.readLine();

        if (isPossible(poetry, remainSpace, remainAlp)) {
            System.out.println(getTitle(poetry));
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isPossible(String poetry, int remainSpace, String remainAlp) {
        StringTokenizer stP = new StringTokenizer(poetry);
        // 스페이스바의 수명이 다했는지
        if (stP.countTokens() - 1 > remainSpace) {
            return false;
        }

        // 내용을 모두 입력할 수 있는지
        int[] alphabets = new int[26];
        StringTokenizer stA = new StringTokenizer(remainAlp);
        for (int i = 0; i < 26; i++) {
            alphabets[i] = Integer.parseInt(stA.nextToken());
        }

        while (stP.hasMoreTokens()) {
            String words = stP.nextToken();
            words = words.toLowerCase();
            for (int i = 0; i < words.length(); i++) {
                int index = words.charAt(i) - 'a';
                if (i >= 1 && words.charAt(i) == words.charAt(i - 1)) continue;
                if (alphabets[index] == 0) {
                    return false;
                } else {
                    alphabets[index]--;
                }
            }
        }

        // 제목을 모두 입력할 수 있는지
        String title = getTitle(poetry).toLowerCase();
        for (int i = 0; i < title.length(); i++) {
            int index = title.charAt(i) - 'a';
            if (i >= 1 && title.charAt(i) == title.charAt(i - 1)) continue;
            if (alphabets[index] == 0) {
                return false;
            } else {
                alphabets[index]--;
            }
        }

        return true;
    }

    public static String getTitle(String poetry) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(poetry);
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken().charAt(0));
        }
        return sb.toString().toUpperCase();
    }
}
