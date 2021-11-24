package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold4_1717 {
    public static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // {0}, {1}...{N}
        int M = Integer.parseInt(st.nextToken());   // 입력으로 주어지는 연산의 개수

        parent = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken()); // 0이면 합집합, 1이면 같은 집합에 포함되어 있는지 확인
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (command == 0) {
                union(a, b);
            } else {
                sb.append(isSameParent(a, b) ? "YES" : "NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int find(int x) {
        if (x == parent[x])
            return x;
        else
            return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        // 같은 부모를 가지고 있지 않을 때
        if (x != y) {
            if (x < y)
                parent[y] = x;
            else
                parent[x] = y;
        }
    }

    //같은 부모 노드를 가지는지 확인
    public static boolean isSameParent(int x, int y) {
        x = find(x);
        y = find(y);
        return x == y;
    }
}
