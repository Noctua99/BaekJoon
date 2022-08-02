package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Silver1_1946 {

    static class Applicant {
        final int documentRanking;
        final int interviewRanking;

        Applicant(int documentRanking, int interviewRanking) {
            this.documentRanking = documentRanking;
            this.interviewRanking = interviewRanking;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());
        while (testCount-- > 0) {

            int applicantCount = Integer.parseInt(br.readLine());
            Applicant[] applicants = new Applicant[applicantCount];

            for (int i = 0; i < applicantCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                applicants[i] = new Applicant(
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken())
                );
            }

            Arrays.sort(applicants, Comparator.comparing(o -> o.documentRanking));

            int maxInterviewRanking = Integer.MAX_VALUE;
            int maxEmploymentCount = 0;
            for (Applicant applicant : applicants) {
                if (applicant.interviewRanking < maxInterviewRanking) {
                    maxInterviewRanking = applicant.interviewRanking;
                    maxEmploymentCount++;
                }
            }

            sb.append(maxEmploymentCount).append('\n');
        }

        System.out.println(sb);
    }
}
