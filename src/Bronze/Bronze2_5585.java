package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_5585 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int moneyToPay = 1000 - Integer.parseInt(br.readLine());

        int[] coins = {500, 100, 50, 10, 5, 1};

        int count = 0;

        for (int coin : coins) {
            while (moneyToPay >= coin) {
                moneyToPay -= coin;
                count++;
            }

            if (moneyToPay == 0) break;
        }

        System.out.println(count);
    }
}
