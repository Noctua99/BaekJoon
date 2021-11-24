package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold4_14698 {
    static final int mod = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            PriorityQueue<Long> slimeEnergy = new PriorityQueue<>();
            int N = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            long result = 1;
            while (N-- > 0) {
                slimeEnergy.offer(Long.parseLong(st.nextToken()));
            }
            while (slimeEnergy.size() >= 2) {
                long energy = slimeEnergy.poll() * slimeEnergy.poll();
                slimeEnergy.offer(energy);
                result = result * (energy % mod) % mod;
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
