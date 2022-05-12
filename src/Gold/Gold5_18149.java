package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_18149 {

    static PriorityQueue<Integer> packages;

    public static int findMinLenOfNeededCord() {
        int neededCord = 0;
        while (packages.size() >= 2) {
            int cordSum = packages.poll() + packages.poll();
            neededCord += cordSum;
            packages.offer(cordSum);
        }

        return neededCord;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());

        while (numOfTests-- > 0) {
            packages = new PriorityQueue<>();

            int numOfPackages = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (numOfPackages-- > 0) {
                packages.offer(Integer.parseInt(st.nextToken()));
            }

            sb.append(findMinLenOfNeededCord()).append('\n');
        }

        System.out.println(sb);
    }
}
