package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver5_7596 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int scenarioNumber = 1;
        while (true) {
            int numOfScenarios = Integer.parseInt(br.readLine());

            if (numOfScenarios == 0) break;

            String[] scenarios = new String[numOfScenarios];

            for (int i = 0; i < numOfScenarios; i++) {
                scenarios[i] = br.readLine();
            }

            Arrays.sort(scenarios);

            sb.append(scenarioNumber++).append('\n');

            for (String scenario : scenarios) {
                sb.append(scenario).append('\n');
            }
        }

        System.out.println(sb);
    }
}
