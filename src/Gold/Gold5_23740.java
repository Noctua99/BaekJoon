package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold5_23740 {

    static class BusRoute {
        int start;
        int end;
        int fare;

        public BusRoute(int start, int end, int fare) {
            this.start = start;
            this.end = end;
            this.fare = fare;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfBusRoutes = Integer.parseInt(br.readLine());

        BusRoute[] busRoutes = new BusRoute[numOfBusRoutes];
        ArrayList<BusRoute> reorganizedBusRoutes = new ArrayList<>();

        for (int i = 0; i < numOfBusRoutes; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            busRoutes[i] = new BusRoute(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(busRoutes, (o1, o2) -> {
            if (o1.start == o2.start) {
                return o1.end - o2.end;
            }
            return o1.start - o2.start;
        });

        BusRoute busRoute = busRoutes[0];
        for (int i = 1; i < numOfBusRoutes; i++) {
            if (busRoute.end >= busRoutes[i].start) {
                busRoute.end = Math.max(busRoutes[i].end, busRoute.end);
                busRoute.fare = Math.min(busRoutes[i].fare, busRoute.fare);
            } else {
                reorganizedBusRoutes.add(busRoute);
                busRoute = busRoutes[i];
            }
        }
        reorganizedBusRoutes.add(busRoute);

        sb.append(reorganizedBusRoutes.size()).append('\n');
        for (BusRoute route : reorganizedBusRoutes) {
            sb.append(route.start).append(' ').append(route.end).append(' ').append(route.fare).append('\n');
        }

        System.out.println(sb);
    }
}
