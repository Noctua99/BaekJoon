package Silver;

import java.io.*;

public class Silver2_1564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        if (factoFive(n) >= 10000) {
            bw.write(factoFive(n) + "\n");
        } else {
            bw.write("0" + factoFive(n) + "\n");
        }


        bw.flush();
        bw.close();
    }

    public static long factoFive(int num) {
        long facto = 1;
        for (int i = 2; i <= num; i++) {
            facto = facto * i;
            while (facto % 10 == 0) {
                facto /= 10;
            }
            facto %= (Math.pow(10, 12));
        }
        return facto % 100000;
    }
}
