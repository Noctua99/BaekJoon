package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_14928 {

    static final int MOD = 20_000_303;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        long ans = 0;

        for (int i = 0; i < input.length(); i++) {
            ans = (ans * 10 + (input.charAt(i) - '0')) % MOD;
        }

        System.out.println(ans);
    }
}
