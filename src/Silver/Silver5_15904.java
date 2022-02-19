package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(canBeShortenedToUCPC(br.readLine()) ? "I love UCPC" : "I hate UCPC");
    }

    public static boolean canBeShortenedToUCPC(String input) {
        char[] UCPC = new char[]{'U', 'C', 'P', 'C'};
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == UCPC[index]) {
                if (index == 3) return true;
                index++;
            }
        }
        return false;
    }
}
