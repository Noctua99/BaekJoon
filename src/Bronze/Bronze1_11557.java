package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1_11557 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        while (testNum-- > 0) {
            int schoolNum = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            String maxSchoolName = st.nextToken();
            int maxAmountOfAlcohol = Integer.parseInt(st.nextToken());
            while (schoolNum-- > 1) {
                st = new StringTokenizer(br.readLine());
                String schoolName = st.nextToken();
                int amountOfAlcohol = Integer.parseInt(st.nextToken());

                if (amountOfAlcohol > maxAmountOfAlcohol) {
                    maxSchoolName = schoolName;
                    maxAmountOfAlcohol = amountOfAlcohol;
                }
            }

            sb.append(maxSchoolName).append('\n');
        }

        System.out.println(sb);
    }
}
