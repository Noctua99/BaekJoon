package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1476 {

    public static int findEarliestYear(int targetE, int targetS, int targetM) {
        int currentE = 1;
        int currentS = 1;
        int currentM = 1;
        int currentYear = 1;

        while (currentE != targetE || currentS != targetS || currentM != targetM) {
            currentE = ++currentE > 15 ? 1 : currentE;
            currentS = ++currentS > 28 ? 1 : currentS;
            currentM = ++currentM > 19 ? 1 : currentM;

            currentYear++;
        }

        return currentYear;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetE = Integer.parseInt(st.nextToken());
        int targetS = Integer.parseInt(st.nextToken());
        int targetM = Integer.parseInt(st.nextToken());

        System.out.println(findEarliestYear(targetE, targetS, targetM));
    }
}
