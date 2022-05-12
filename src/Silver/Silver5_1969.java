package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1969 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfDNA = Integer.parseInt(st.nextToken());
        int lenOfDNA = Integer.parseInt(st.nextToken());

        char[][] dna = new char[numOfDNA][lenOfDNA];
        char[] ans = new char[lenOfDNA];
        char[] nucleotides = new char[]{'A', 'C', 'G', 'T'};

        for (int i = 0; i < numOfDNA; i++) {
            dna[i] = br.readLine().toCharArray();
        }

        int totalError = 0;
        for (int i = 0; i < lenOfDNA; i++) {
            int[] errors = new int[4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < numOfDNA; k++) {
                    if (dna[k][i] != nucleotides[j]) {
                        errors[j]++;
                    }
                }
            }

            int smallestIndex = 0;
            for (int j = 1; j < 4; j++) {
                if (errors[j] < errors[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            ans[i] = nucleotides[smallestIndex];
            totalError += errors[smallestIndex];
        }

        System.out.println(ans);
        System.out.println(totalError);
    }
}
