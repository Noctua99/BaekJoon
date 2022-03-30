package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Silver5_11235 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> nameToVote = new HashMap<>();

        int voteNum = Integer.parseInt(br.readLine());

        while (voteNum-- > 0) {
            String name = br.readLine();
            nameToVote.put(name, nameToVote.getOrDefault(name, 0) + 1);
        }

        int maxVote = Integer.MIN_VALUE;
        for (int vote : nameToVote.values()) {
            maxVote = Math.max(maxVote, vote);
        }

        ArrayList<String> nameWithMostVote = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : nameToVote.entrySet()) {
            if (entry.getValue() == maxVote) {
                nameWithMostVote.add(entry.getKey());
            }
        }

        Collections.sort(nameWithMostVote);

        StringBuilder sb = new StringBuilder();

        for (String name : nameWithMostVote) {
            sb.append(name).append('\n');
        }

        System.out.println(sb);
    }
}
