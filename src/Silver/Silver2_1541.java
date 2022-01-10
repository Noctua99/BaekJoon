package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 0;

        StringTokenizer stMinus = new StringTokenizer(input, "-");
        StringTokenizer stPlus = new StringTokenizer(stMinus.nextToken(), "+");
        while (stPlus.hasMoreTokens()) {
            result += Integer.parseInt(stPlus.nextToken());
        }

        while (stMinus.hasMoreTokens()) {
            stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            while (stPlus.hasMoreTokens()) {
                result -= Integer.parseInt(stPlus.nextToken());
            }
        }

        System.out.println(result);
    }
}
