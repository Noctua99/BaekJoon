package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_4649 {

    public static int findHowManyCustomersWalkedAway(int numOfBeds, String input) {
        HashSet<Character> onBeds = new HashSet<>();
        HashSet<Character> walkedAway = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char customer = input.charAt(i);

            if (onBeds.contains(customer)) {
                onBeds.remove(customer);
            } else if (onBeds.size() < numOfBeds) {
                onBeds.add(customer);
            } else {
                walkedAway.add(customer);
            }
        }

        return walkedAway.size();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfBeds = Integer.parseInt(st.nextToken());

            if (numOfBeds == 0) break;

            int result = findHowManyCustomersWalkedAway(numOfBeds, st.nextToken());
            if (result == 0) {
                sb.append("All customers tanned successfully.\n");
            } else {
                sb.append(result).append(" customer(s) walked away.\n");
            }
        }

        System.out.println(sb);
    }
}
