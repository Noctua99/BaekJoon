package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Silver4_10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> participants = new HashMap<>();

        int numOfParticipants = Integer.parseInt(br.readLine());
        for (int i = 0; i < numOfParticipants; i++) {
            String name = br.readLine();
            participants.put(name, participants.getOrDefault(name, 0) + 1);
        }

        while (numOfParticipants-- > 1) {
            String name = br.readLine();
            if (participants.get(name) == 1) {
                participants.remove(name);
            } else {
                participants.put(name, participants.get(name) - 1);
            }
        }

        for (String participant : participants.keySet()) {
            System.out.println(participant);
        }
    }
}
