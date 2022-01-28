package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver4_17254 {
    static class Input implements Comparable<Input> {
        int kBNum;
        int time;
        String value;

        public Input(int kBNum, int time, String value) {
            this.kBNum = kBNum;
            this.time = time;
            this.value = value;
        }

        @Override
        public int compareTo(Input o) {
            if (this.time == o.time) {
                return this.kBNum - o.kBNum;
            } else {
                return this.time - o.time;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int numOfInput = Integer.parseInt(st.nextToken());

        Input[] inputs = new Input[numOfInput];

        for (int i = 0; i < numOfInput; i++) {
            st = new StringTokenizer(br.readLine());
            inputs[i] = new Input(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    st.nextToken());
        }

        Arrays.sort(inputs);

        for (Input input : inputs) {
            sb.append(input.value);
        }

        System.out.println(sb);
    }
}
