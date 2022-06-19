package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3_9659 {

    public static boolean isSKWin(long n) {

        return n % 2 == 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isSKWin(Long.parseLong(br.readLine())) ? "SK" : "CY");
    }
}
