package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Silver5_12787 {
    static BigInteger[] pow256 = new BigInteger[]{BigInteger.valueOf(72057594037927936L),
            BigInteger.valueOf(281474976710656L), BigInteger.valueOf(1099511627776L),
            BigInteger.valueOf(4294967296L), BigInteger.valueOf(16777216),
            BigInteger.valueOf(65536), BigInteger.valueOf(256), BigInteger.ONE};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            String[] inputs = br.readLine().split(" ");
            if (inputs[0].equals("1")) {
                sb.append(addressToNumber(inputs[1])).append('\n');
            } else {
                sb.append(numberToAddress(new BigInteger(inputs[1]))).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static String addressToNumber(String address) {
        BigInteger result = BigInteger.ZERO;

        String[] splitedAddr = address.split("\\.");
        for (int i = 0; i < 8; i++) {
            result = result.add(new BigInteger(splitedAddr[i]).multiply(pow256[i]));
        }

        return result.toString();
    }

    public static String numberToAddress(BigInteger number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            result.append(number.divide(pow256[i])).append('.');
            number = number.mod(pow256[i]);
        }
        result.append(number.divide(pow256[7]));
        return result.toString();
    }
}
