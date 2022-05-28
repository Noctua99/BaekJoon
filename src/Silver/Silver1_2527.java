package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1_2527 {

    static class Rectangle {
        int x, y;   // 왼쪽 아래 꼭짓점 좌표
        int p, q;   // 오른쪽 위 꼭짓점 좌표

        public Rectangle(int x, int y, int p, int q) {
            this.x = x;
            this.y = y;
            this.p = p;
            this.q = q;
        }
    }

    public static char findHowIntersect(Rectangle r1, Rectangle r2) {
        // 공통부분이 없음
        if (r1.x > r2.p || r1.p < r2.x || r1.y > r2.q || r1.q < r2.y) {
            return 'd';
        }
        // 점
        else if ((r1.x == r2.p && r1.y == r2.q) || (r1.p == r2.x && r1.q == r2.y) ||
                (r1.x == r2.p && r1.q == r2.y) || (r1.p == r2.x && r1.y == r2.q)) {
            return 'c';
        }
        // 선분
        else if (r1.x == r2.p || r1.p == r2.x || r1.y == r2.q || r1.q == r2.y) {
            return 'b';
        }

        // 공통부분이 직사각형인 경우
        return 'a';
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(findHowIntersect(
                    new Rectangle(
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken())
                    ), new Rectangle(
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken())
                    )
            )).append('\n');
        }

        System.out.println(sb);
    }
}
