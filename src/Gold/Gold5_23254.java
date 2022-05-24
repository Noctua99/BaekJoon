package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold5_23254 {

    static class Subject {
        int score;
        int scoreH;

        public Subject(int score, int scoreH) {
            this.score = score;
            this.scoreH = scoreH;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Subject> subjects = new PriorityQueue<>((o1, o2) -> o2.scoreH - o1.scoreH);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int remainTime = 24 * Integer.parseInt(st.nextToken());
        int numOfSubj = Integer.parseInt(st.nextToken());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        while (numOfSubj-- > 0) {
            subjects.offer(new Subject(
                    Integer.parseInt(stA.nextToken()),
                    Integer.parseInt(stB.nextToken())
            ));
        }

        int totalScore = 0;

        while (remainTime > 0 && !subjects.isEmpty()) {
            Subject subject = subjects.poll();

            if (subject.score + subject.scoreH <= 100) {
                int studyTime = Math.min((100 - subject.score) / subject.scoreH, remainTime);
                remainTime -= studyTime;
                subject.score += studyTime * subject.scoreH;
            } else {
                subject.scoreH = 100 - subject.score;
            }

            if (subject.score == 100) {
                totalScore += 100;
                continue;
            }

            subjects.offer(subject);
        }

        for (Subject subject : subjects) {
            totalScore += subject.score;
        }

        System.out.println(totalScore);
    }
}
