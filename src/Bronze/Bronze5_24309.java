package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bronze5_24309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());

        System.out.println(
                new BigInteger(br.readLine()).subtract(new BigInteger(br.readLine())).divide(N)
        );
    }
}
