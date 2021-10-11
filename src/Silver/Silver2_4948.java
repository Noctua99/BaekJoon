package Silver;

import java.io.*;
import java.util.Arrays;

public class Silver2_4948 {
    static boolean[] primeNumber = new boolean[246913];

    public static void main(String[] args) throws IOException {
        Silver2_4948 main = new Silver2_4948();
        main.setPrimeNumber();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int test = Integer.parseInt(br.readLine());

            if (test == 0) break;

            int count = 0;

            for (int i = test + 1; i <= test * 2; i++) {
                if (primeNumber[i]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public void setPrimeNumber() {
        Arrays.fill(primeNumber, true);
        for (int i = 2; i * i <= 246912; i++) {
            primeNumber[1] = false;
            if (primeNumber[i]) {
                for (int j = i * i; j <= 246912; j += i) {
                    primeNumber[j] = false;
                }
            }
        }
    }
}
