package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_23843 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfDevices = Integer.parseInt(st.nextToken());    // 전자기기의 개수
        int numOfOutlets = Integer.parseInt(st.nextToken());    // 콘센트의 개수

        Integer[] devices = new Integer[numOfDevices];
        PriorityQueue<Integer> outlets = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfDevices; i++) {
            devices[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(devices, Comparator.reverseOrder());

        for (int device : devices) {
            if (outlets.size() < numOfOutlets) {
                outlets.offer(device);
            } else {
                outlets.offer(outlets.poll() + device);
            }
        }

        System.out.println(outlets.stream().max(Integer::compareTo).get());
    }
}
