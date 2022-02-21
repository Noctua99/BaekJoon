package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver4_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cityNum = Integer.parseInt(br.readLine());

        long[] roadLengths = new long[cityNum - 1];
        Queue<Long> oilPrices = new ArrayDeque<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < cityNum - 1; i++) {
            roadLengths[i] = Long.parseLong(st1.nextToken());
            oilPrices.add(Long.parseLong(st2.nextToken()));
        }

        System.out.println(findMinCost(roadLengths, oilPrices));
    }

    public static long findMinCost(long[] roadLengths, Queue<Long> oilPrices) {
        long minCost = 0;
        long cheapOilPrice = Long.MAX_VALUE;

        for (long roadLength : roadLengths) {
            if (oilPrices.peek() < cheapOilPrice) {
                cheapOilPrice = oilPrices.poll();
            } else {
                oilPrices.poll();
            }
            minCost += roadLength * cheapOilPrice;
        }

        return minCost;
    }
}
