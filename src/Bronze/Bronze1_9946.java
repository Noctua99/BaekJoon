package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1_9946 {

    public static boolean haveSameLetters(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] alp = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            alp[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            alp[s2.charAt(i) - 'a']--;
        }

        for (int val : alp) {
            if (val != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseNum = 1;
        String s1;
        while ((s1 = br.readLine()).charAt(0) != 'E') {
            String s2 = br.readLine();

            sb.append("Case ").append(caseNum).append(": ").
                    append(haveSameLetters(s1, s2) ? "same\n" : "different\n");
            caseNum++;
        }

        System.out.println(sb);
    }
}
