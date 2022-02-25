package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Silver5_11637 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int numOfTests = Integer.parseInt(br.readLine());
        while (numOfTests-- > 0) {
            int numOfCandidates = Integer.parseInt(br.readLine());
            int voteSum = 0;

            ArrayList<Candidate> candidates = new ArrayList<>();
            for (int i = 1; i <= numOfCandidates; i++) {
                int votes = Integer.parseInt(br.readLine());
                voteSum += votes;
                candidates.add(
                        new Candidate(i, votes)
                );
            }

            candidates.sort((o1, o2) -> o2.votes - o1.votes);

            if (candidates.get(0).votes == candidates.get(1).votes) {
                result.append("no winner\n");
            } else if (candidates.get(0).votes > voteSum / 2) {
                result.append("majority winner ").append(candidates.get(0).id).append('\n');
            } else {
                result.append("minority winner ").append(candidates.get(0).id).append('\n');
            }
        }

        System.out.println(result);
    }

    static class Candidate {
        final int id;
        final int votes;

        public Candidate(int id, int votes) {
            this.id = id;
            this.votes = votes;
        }
    }
}
