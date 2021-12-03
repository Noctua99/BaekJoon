package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class Silver4_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> cardsMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        long num = Long.parseLong(br.readLine());
        cardsMap.put(num, cardsMap.getOrDefault(num, 1) + 1);
        while (N-- > 1) {
            num = Long.parseLong(br.readLine());
            cardsMap.put(num, cardsMap.getOrDefault(num, 1) + 1);
        }


        long maxCard = num;
        for (long card : cardsMap.keySet()) {
            if (cardsMap.get(card) > cardsMap.get(maxCard)) {
                maxCard = card;
            } else if (Objects.equals(cardsMap.get(card), cardsMap.get(maxCard))) {
                maxCard = Math.min(maxCard, card);
            }
        }
        System.out.println(maxCard);
    }
}
