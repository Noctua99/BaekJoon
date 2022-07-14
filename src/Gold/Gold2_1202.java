package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Gold2_1202 {

    static class Jewel {
        final int weight;
        final int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int jewelCount = Integer.parseInt(st.nextToken());
        int bagCount = Integer.parseInt(st.nextToken());

        PriorityQueue<Jewel> jewels = new PriorityQueue<>((o1, o2) -> {
            if (o1.price == o2.price) {
                return o2.weight - o1.weight;
            }
            return o2.price - o1.price;
        });
        TreeMap<Integer, Integer> bags = new TreeMap<>();

        while (jewelCount-- > 0) {
            st = new StringTokenizer(br.readLine());
            jewels.offer(new Jewel(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        while (bagCount-- > 0) {
            int maxWeight = Integer.parseInt(br.readLine());
            bags.put(maxWeight, bags.getOrDefault(maxWeight, 0) + 1);
        }

        long maxPriceSum = 0;

        while (!jewels.isEmpty() && !bags.isEmpty()) {
            Jewel jewel = jewels.poll();
            Integer bag = bags.ceilingKey(jewel.weight);

            if (bag != null) {
                maxPriceSum += jewel.price;
                if (bags.get(bag) == 1) {
                    bags.remove(bag);
                } else {
                    bags.put(bag, bags.get(bag) - 1);
                }
            }
        }

        System.out.println(maxPriceSum);
    }
}
