package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_2578 {

    static int[][] bingoBoard = new int[5][5];
    static boolean[][] isChecked = new boolean[5][5];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        Loop:
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                checkBoard(Integer.parseInt(st.nextToken()));
                if (isBingo()) {
                    result = (i) * 5 + j + 1;
                    break Loop;
                }
            }
        }

        System.out.println(result);
    }

    public static void checkBoard(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingoBoard[i][j] == num) {
                    isChecked[i][j] = true;
                }
            }
        }
    }

    public static boolean isBingo() {
        int lineNum = 0;

        // 가로
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;

            for (int j = 0; j < 5; j++) {
                if (!isChecked[i][j]) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo) {
                lineNum++;
            }
        }

        // 세로
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;

            for (int j = 0; j < 5; j++) {
                if (!isChecked[j][i]) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo) {
                lineNum++;
            }
        }

        // 왼쪽 위에서 오른쪽 아래 대각선
        if (isChecked[0][0] && isChecked[1][1] && isChecked[2][2] && isChecked[3][3] && isChecked[4][4]) {
            lineNum++;
        }
        // 왼쪽 아래에서 오른쪽 위 대각선
        if (isChecked[4][0] && isChecked[3][1] && isChecked[2][2] && isChecked[1][3] && isChecked[0][4]) {
            lineNum++;
        }

        return lineNum >= 3;
    }
}
