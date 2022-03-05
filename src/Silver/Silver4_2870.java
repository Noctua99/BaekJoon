package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Silver4_2870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int numOfLines = Integer.parseInt(br.readLine());

        ArrayList<String> numbers = new ArrayList<>();

        while (numOfLines-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "abcdefghijklmnopqrstuvwxyz");

            while (st.hasMoreTokens()) {
                String input = st.nextToken().replaceFirst("^0*", "");
                if (input.equals("")) {
                    input = "0";
                }
                numbers.add(input);
            }
        }

        numbers.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }

            return o1.length() - o2.length();
        });

        for (String number : numbers) {
            result.append(number).append('\n');
        }

        System.out.println(result);
    }
}