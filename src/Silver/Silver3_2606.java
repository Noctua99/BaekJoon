package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Silver3_2606 {
    static ArrayList<Integer>[] computerGraph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 컴퓨터의 수
        int Q = Integer.parseInt(br.readLine());    // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        computerGraph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            computerGraph[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int comp1 = Integer.parseInt(st.nextToken());
            int comp2 = Integer.parseInt(st.nextToken());
            computerGraph[comp1].add(comp2);
            computerGraph[comp2].add(comp1);
        }
        dfs(1);
        System.out.println(count - 1);
    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        count++;

        for (int node : computerGraph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }
}
