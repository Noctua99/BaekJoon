package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver1_13335 {

    static class Truck {
        int location = 1;
        final int weight;

        public Truck(int weight) {
            this.weight = weight;
        }
    }

    public static int solve(Queue<Truck> trucks, int lenOfBridge, int maxLoad) {
        Deque<Truck> trucksOnTheBridge = new ArrayDeque<>();
        int sumOfWeights = 0;
        int timeToCrossTheBridge = 0;

        while (!trucks.isEmpty()) {
            // move truck
            for (Truck truck : trucksOnTheBridge) {
                truck.location++;
                if (truck.location > lenOfBridge) {
                    sumOfWeights -= trucksOnTheBridge.pollFirst().weight;
                }
            }

            if (sumOfWeights + trucks.peek().weight <= maxLoad) {
                sumOfWeights += trucks.peek().weight;
                trucksOnTheBridge.offerLast(trucks.poll());
            }

            timeToCrossTheBridge++;
        }

        timeToCrossTheBridge += lenOfBridge;

        return timeToCrossTheBridge;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfTrucks = Integer.parseInt(st.nextToken());
        int lenOfBridge = Integer.parseInt(st.nextToken());
        int maxLoad = Integer.parseInt(st.nextToken());

        Queue<Truck> trucks = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        while (numOfTrucks-- > 0) {
            trucks.add(new Truck(Integer.parseInt(st.nextToken())));
        }

        System.out.println(solve(trucks, lenOfBridge, maxLoad));
    }
}
