package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver4_11507 {
    static HashSet<String> cards = new HashSet<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if (isDuplicated(input)) {
            sb.append("GRESKA");
        } else {
            int[] PKHT = new int[4];
            for (String card : cards) {
                switch (card.charAt(0)) {
                    case 'P':
                        PKHT[0]++;
                        break;
                    case 'K':
                        PKHT[1]++;
                        break;
                    case 'H':
                        PKHT[2]++;
                        break;
                    case 'T':
                        PKHT[3]++;
                        break;
                }
            }
            for (int num : PKHT) {
                sb.append(13 - num).append(" ");
            }
        }

        System.out.println(sb);
    }

    public static boolean isDuplicated(String input) {
        int len = input.length();
        if (len > 156) {
            return true;
        }
        for (int i = 0; i < len; i += 3) {
            String card = input.substring(i, i + 3);
            if (cards.contains(card)) {
                return true;
            }
            cards.add(card);
        }
        return false;
    }
}
