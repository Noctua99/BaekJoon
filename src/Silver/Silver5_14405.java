package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_14405 {

    public static boolean canBeMade(String s) {
        return s.replaceAll("pi|ka|chu", "").equals("");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(canBeMade(br.readLine()) ? "YES" : "NO");
    }
}
