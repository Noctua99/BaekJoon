package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Silver3_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        ArrayList<Integer> testList = new ArrayList<>();
        while (T-- > 0) {
            testList.clear();

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            while (N-- > 0) {
                testList.add(Integer.parseInt(st.nextToken()));
            }

            long sum = 0;
            for (int i = 0; i < testList.size() - 1; i++) {
                for (int j = i + 1; j < testList.size(); j++) {
                    sum += gcd(testList.get(i), testList.get(j));
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {   // 유클리드 호제법을 이용한 최대공약수 구하기
        int temp;
        while (b != 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
