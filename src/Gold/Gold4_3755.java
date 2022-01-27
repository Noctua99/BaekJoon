package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Gold4_3755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeMap<Integer, Integer> waitingList = new TreeMap<>();

        loop:
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            switch (type) {
                case 0: //  The system needs to stop serving
                    break loop;
                case 1: // Add client K to the waiting list with priority P
                    int id = Integer.parseInt(st.nextToken());
                    int priority = Integer.parseInt(st.nextToken());
                    waitingList.put(priority, id);
                    break;
                case 2: // Serve the client with the highest priority and drop him or her from the waiting list
                    if (waitingList.isEmpty()) {
                        sb.append("0\n");
                    } else {
                        sb.append(waitingList.pollLastEntry().getValue()).append('\n');
                    }
                    break;
                case 3: // Serve the client with the lowest priority and drop him or her from the waiting list
                    if (waitingList.isEmpty()) {
                        sb.append("0\n");
                    } else {
                        sb.append(waitingList.pollFirstEntry().getValue()).append('\n');
                    }
            }
        }

        System.out.println(sb);
    }
}
