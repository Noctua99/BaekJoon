package Bronze;

import java.util.Scanner;

public class Bronze1_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int subj = sc.nextInt();
		int scoreIndex[] = new int[1000];
		double sum = 0;

		for (int i = 0; i < subj; i++) {
			scoreIndex[i] = sc.nextInt();
		}

		int maxScore = -1;

		for (int i = 0; i < subj; i++) {
			if (scoreIndex[i] > maxScore) {
				maxScore = scoreIndex[i];
			}
		}
		
		for (int i = 0; i < subj; i++) {
			double revisedScore = (double)scoreIndex[i]/maxScore*100;
			sum=sum+revisedScore;
		}
		System.out.println(sum/subj);

		sc.close();
	}

}
