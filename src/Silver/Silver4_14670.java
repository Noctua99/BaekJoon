package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_14670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] drugs = new int[101]; // 약의 효능과 이름
        Arrays.fill(drugs, -1);

        int numOfDrugs = Integer.parseInt(br.readLine()); // 약의 종류의 개수
        while (numOfDrugs-- > 0) {
            st = new StringTokenizer(br.readLine());
            drugs[Integer.parseInt(st.nextToken())] += Integer.parseInt(st.nextToken()) + 1;
        }

        int numOfInput = Integer.parseInt(br.readLine());
        while (numOfInput-- > 0) {
            st = new StringTokenizer(br.readLine());
            int numOfSymptoms = Integer.parseInt(st.nextToken());
            boolean isDied = false;

            int[] symptoms = new int[numOfSymptoms];
            for (int i = 0; i < numOfSymptoms; i++) {
                symptoms[i] = Integer.parseInt(st.nextToken());
                if (drugs[symptoms[i]] == -1) {
                    isDied = true;
                    break;
                }
            }

            if (isDied) {
                sb.append("YOU DIED");
            } else {
                for (int symptom : symptoms) {
                    sb.append(drugs[symptom]).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
