package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_14916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(findMinCoins(Integer.parseInt(br.readLine())));
    }

    public static int findMinCoins(int chargeAmount) {
        int coin5 = chargeAmount / 5;
        while (coin5 >= 0) {
            if ((chargeAmount - coin5 * 5) % 2 == 0) {
                return coin5 + (chargeAmount - coin5 * 5) / 2;
            }
            coin5--;
        }

        return -1;
    }
}
