package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver2_11725 {

    public static void solve(ArrayList<Integer>[] graph, int[] parents) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int parentNode = queue.poll();
            for (int node : graph[parentNode]) {
                if (node != 1 && parents[node] == 0) {
                    parents[node] = parentNode;
                    queue.offer(node);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nodeNum = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[nodeNum + 1];
        int[] parents = new int[nodeNum + 1];

        for (int i = 1; i <= nodeNum; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < nodeNum - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());
            graph[nodeA].add(nodeB);
            graph[nodeB].add(nodeA);
        }

        solve(graph, parents);

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= nodeNum; i++) {
            sb.append(parents[i]).append('\n');
        }

        System.out.println(sb);
    }
}
