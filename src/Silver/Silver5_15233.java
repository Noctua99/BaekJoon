package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_15233 {
    static HashSet<String> playersA = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfPlayersA = Integer.parseInt(st.nextToken());
        st.nextToken();
        int numOfGoals = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (numOfPlayersA-- > 0) {
            playersA.add(st.nextToken());
        }
        br.readLine();

        System.out.println(findWinningTeam(new StringTokenizer(br.readLine()), numOfGoals));
    }

    public static String findWinningTeam(StringTokenizer st, int numOfGoals) {
        int scoreA = 0;
        while (numOfGoals-- > 0) {
            if (playersA.contains(st.nextToken()))
                scoreA++;
            else
                scoreA--;
        }
        if (scoreA > 0)
            return "A";
        else if (scoreA == 0)
            return "TIE";
        else
            return "B";
    }
}
