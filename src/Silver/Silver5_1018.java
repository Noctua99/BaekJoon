package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Silver5_1018 {
	char[][] chessboardB = createChessboard('B', 'W');
	char[][] chessboardW = createChessboard('W', 'B');

	public static void main(String[] args) throws IOException {
		Silver5_1018 silver = new Silver5_1018();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}

		bw.write(String.valueOf(silver.find(N, M, str)));

		bw.flush();
		br.close();
		bw.close();
	}

	public char[][] createChessboard(char ch1, char ch2) {
		char[][] charArray = new char[8][8];
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 8; j++) {
					if (j % 2 == 0)
						charArray[i][j] = ch1;
					else {
						charArray[i][j] = ch2;
					}
				}
			} else {
				for (int j = 0; j < 8; j++) {
					if (j % 2 == 0)
						charArray[i][j] = ch2;
					else {
						charArray[i][j] = ch1;
					}
				}
			}
		}
		return charArray;
	}

	public int find(int N, int M, String[] str) {
		int countB = 0;
		int countW = 0;
		int mincount = 2500;
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						if (str[i + k].charAt(j + l) != chessboardB[k][l]) {
							countB++;
						}
						if (str[i + k].charAt(j + l) != chessboardW[k][l]) {
							countW++;
						}
					}
				}
				mincount = Math.min(mincount, countB);
				mincount = Math.min(mincount, countW);
				countB = 0;
				countW = 0;
			}
		}
		return mincount;
	}
}
