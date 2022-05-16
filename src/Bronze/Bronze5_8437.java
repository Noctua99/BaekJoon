package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.math.BigInteger.TWO;

public class Bronze5_8437 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger K = new BigInteger(br.readLine());

        System.out.println(N.divide(TWO).add(K.divide(TWO)).add(N.mod(TWO)));
        System.out.println(N.divide(TWO).subtract(K.divide(TWO)));
    }
}
