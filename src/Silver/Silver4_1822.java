package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver4_1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int sizeOfA = Integer.parseInt(st.nextToken());
        int sizeOfB = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        int[] arrB = new int[sizeOfB];

        st = new StringTokenizer(br.readLine());
        while (sizeOfA-- > 0) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfB; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        for (int data : arrB) {
            setA.remove(data);
        }

        sb.append(setA.size()).append('\n');

        int[] result = new int[setA.size()];
        int i = 0;
        for (int data : setA) {
            result[i] = data;
            i++;
        }

        Arrays.sort(result);

        for (int data : result) {
            sb.append(data).append(" ");
        }

        System.out.println(sb);
    }
}
