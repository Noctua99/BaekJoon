package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver5_9773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> honeybeesWorks = new HashMap<>();

        int numOfWorks = 0;

        String[] works = new String[]{"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        for (String work : works) {
            honeybeesWorks.put(work, 0);
        }

        String input = "";
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                String work = st.nextToken();
                honeybeesWorks.put(work, honeybeesWorks.getOrDefault(work, 0) + 1);

                numOfWorks++;
            }
        }

        for (String work : works) {
            if (honeybeesWorks.containsKey(work)) {
                int workCount = honeybeesWorks.get(work);
                sb.append(work).append(" ").append(workCount).append(" ").
                        append(String.format("%.2f", (double) workCount / numOfWorks)).append('\n');
            }
        }
        sb.append("Total ").append(numOfWorks).append(" 1.00");

        System.out.println(sb);
    }
}
