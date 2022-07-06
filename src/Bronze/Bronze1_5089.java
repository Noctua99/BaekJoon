package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Bronze1_5089 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int weekNum = 1;
        while (true) {
            int townCount = Integer.parseInt(br.readLine());

            if (townCount == 0) break;

            HashSet<String> towns = new HashSet<>();

            while (townCount-- > 0) {
                towns.add(br.readLine());
            }

            sb.append("Week ").append(weekNum++).append(" ").append(towns.size()).append("\n");
        }

        System.out.println(sb);
    }
}
