package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver3_1431 {
    static class Guitar implements Comparable<Guitar> {
        String serialNum;
        int len;
        int digitSum = 0;

        public Guitar(String serialNum) {
            this.serialNum = serialNum;
            this.len = serialNum.length();

            for (int i = 0; i < len; i++) {
                if (this.serialNum.charAt(i) <= '9') {
                    this.digitSum += (this.serialNum.charAt(i) - '0');
                }
            }
        }

        @Override
        public int compareTo(Guitar o) {
            if (this.len == o.len) {
                if (this.digitSum == o.digitSum) {
                    return this.serialNum.compareTo(o.serialNum);
                }
                return this.digitSum - o.digitSum;
            }
            return this.len - o.len;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int guitarNum = Integer.parseInt(br.readLine());
        Guitar[] guitars = new Guitar[guitarNum];

        for (int i = 0; i < guitarNum; i++) {
            guitars[i] = new Guitar(br.readLine());
        }

        Arrays.sort(guitars);

        for (Guitar guitar : guitars) {
            sb.append(guitar.serialNum).append('\n');
        }

        System.out.println(sb);
    }
}
