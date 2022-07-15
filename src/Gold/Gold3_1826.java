package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold3_1826 {

    static class GasStation {
        final int distance; // 성경이의 시작 위치에서 주유소 까지의 거리
        final int fuel;     // 주유소에서 채울 수 있는 연료의 양

        GasStation(int distance, int fuel) {
            this.distance = distance;
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<GasStation> gasStations = new PriorityQueue<>(Comparator.comparing(o -> o.distance)); // 주유소
        PriorityQueue<Integer> fuels = new PriorityQueue<>(Comparator.reverseOrder());  // 지나온 주유소들에서 채울 수 있는 연료

        int gasStationCount = Integer.parseInt(br.readLine());  // 주유소의 개수
        while (gasStationCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            gasStations.offer(new GasStation(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int totalDistance = Integer.parseInt(st.nextToken());     // 성경이의 위치에서 마을까지의 거리
        int curFuel = Integer.parseInt(st.nextToken());                 // 트럭에 원래 있던 연료의 양

        int stopCount = 0;

        while (curFuel < totalDistance) {
            while (!gasStations.isEmpty() && curFuel >= gasStations.peek().distance) {
                fuels.offer(gasStations.poll().fuel);
            }

            if (fuels.isEmpty()) break;

            curFuel += fuels.poll();
            stopCount++;
        }

        System.out.println(curFuel >= totalDistance ? stopCount : -1);
    }
}
