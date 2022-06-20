package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold5_9660 {

    public static boolean isCYWin(long n) {

        return n % 7 == 0 || n % 7 == 2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isCYWin(Long.parseLong(br.readLine())) ? "CY" : "SK");
    }
}
