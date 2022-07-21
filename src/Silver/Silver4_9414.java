package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Silver4_9414 {

    static final int MAX = 5_000_000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());

        while (testCount-- > 0) {
            ArrayList<Integer> priceList = new ArrayList<>();

            int price;
            while ((price = Integer.parseInt(br.readLine())) != 0) {
                priceList.add(price);
            }

            priceList.sort(Comparator.reverseOrder());

            int priceSum = 0;

            for (int i = 0; i < priceList.size(); i++) {
                priceSum += 2 * Math.pow(priceList.get(i), i + 1);

                if (priceSum > MAX) break;
            }

            sb.append(priceSum <= MAX ? priceSum : "Too expensive").append('\n');
        }

        System.out.println(sb);
    }
}
