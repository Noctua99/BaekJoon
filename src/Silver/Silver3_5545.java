package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Silver3_5545 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfToppings = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int pizzaPrice = Integer.parseInt(st.nextToken());
        final int toppingPrice = Integer.parseInt(st.nextToken());

        int pizzaEnergy = Integer.parseInt(br.readLine());

        ArrayList<Integer> toppings = new ArrayList<>();
        while (numOfToppings-- > 0) {
            toppings.add(Integer.parseInt(br.readLine()));
        }

        toppings.sort(Comparator.reverseOrder());

        for (int energy : toppings) {
            if (pizzaEnergy / pizzaPrice < energy / toppingPrice) {
                pizzaPrice += toppingPrice;
                pizzaEnergy += energy;
            } else {
                break;
            }
        }

        System.out.println(pizzaEnergy / pizzaPrice);
    }
}
