package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver3_17264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<String> winningPlayers = new HashSet<>();   // 같이 플레이 하게 되면 반드시 이기는 플레이어들
        int nowScore = 0; // 현재 점수
        boolean isIRON = true;

        st = new StringTokenizer(br.readLine());
        int numOfGame = Integer.parseInt(st.nextToken());   // 총 게임 횟수
        int numOfPlayerInfo = Integer.parseInt(st.nextToken()); // 해킹을 통해 얻은 플레이어 정보의 수

        st = new StringTokenizer(br.readLine());
        int winScore = Integer.parseInt(st.nextToken());    // 이긴 경우 획득 점수
        int loseScore = Integer.parseInt(st.nextToken());   // 졌을 때 떨어지는 점수
        int neededScore = Integer.parseInt(st.nextToken());   // IRON 티어에서 벗어나기 위한 점수

        while (numOfPlayerInfo-- > 0) {
            st = new StringTokenizer(br.readLine());
            String playerName = st.nextToken();
            if (st.nextToken().equals("W")) {
                winningPlayers.add(playerName);
            }
        }

        while (numOfGame-- > 0) {
            if (winningPlayers.contains(br.readLine())) {
                nowScore += winScore;
            } else {
                nowScore -= loseScore;
                if (nowScore < 0) {
                    nowScore = 0;
                }
            }
            if (nowScore >= neededScore) {
                System.out.println("I AM NOT IRONMAN!!");
                isIRON = false;
                break;
            }
        }
        if (isIRON) {
            System.out.println("I AM IRONMAN!!");
        }
    }
}
