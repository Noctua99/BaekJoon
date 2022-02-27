package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_20949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int numOfMonitors = Integer.parseInt(br.readLine());
        Monitor[] monitors = new Monitor[numOfMonitors];

        for (int i = 1; i <= numOfMonitors; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            monitors[i - 1] = new Monitor(
                    i,
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(monitors, (o1, o2) -> o2.ppi - o1.ppi);

        for (Monitor monitor : monitors) {
            result.append(monitor.id).append('\n');
        }

        System.out.println(result);
    }

    static class Monitor {
        final int id;
        final int ppi;

        public Monitor(int id, int width, int height) {
            this.id = id;
            this.ppi = (width * width) + (height * height);
        }
    }
}
