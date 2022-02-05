package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfA = Integer.parseInt(st.nextToken());
        int sizeOfB = Integer.parseInt(st.nextToken());

        int[] arr = new int[sizeOfA + sizeOfB];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfA; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = sizeOfA; i < sizeOfA + sizeOfB; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int data : arr) {
            sb.append(data).append(' ');
        }

        System.out.println(sb);
    }
}
