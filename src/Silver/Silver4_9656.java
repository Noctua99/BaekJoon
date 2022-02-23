package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(whoWinStoneGame(Integer.parseInt(br.readLine())));
    }

    public static String whoWinStoneGame(int stoneNum) {
        String winner = "CY";
        if (stoneNum % 2 == 0) {
            winner = "SK";
        }

        return winner;
    }
}
