package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_16395 {

    static int[][] pascal;

    public static int findPascalNumber(int n, int k) {
        setPascal(n);

        return pascal[n - 1][k - 1];
    }

    public static void setPascal(int n) {
        pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(findPascalNumber(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()))
        );
    }
}
