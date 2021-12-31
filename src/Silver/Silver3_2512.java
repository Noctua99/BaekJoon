package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numOfCities = Integer.parseInt(br.readLine());
        int[] cities = new int[numOfCities];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < numOfCities; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
            max = Math.max(cities[i], max);
        }

        int totalBudget = Integer.parseInt(br.readLine());

        System.out.println(findMaxBudget(cities, max, totalBudget));
    }

    public static int findMaxBudget(int[] arr, int max, int targetSum) {
        int first = 0;
        int last = max;
        while (first <= last) {
            int mid = (first + last) / 2;

            int sum = 0;
            for (int data : arr) {
                if (mid >= data) {
                    sum += data;
                } else {
                    sum += mid;
                }
            }

            if (sum == targetSum) {
                return mid;
            } else if (sum > targetSum) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}
