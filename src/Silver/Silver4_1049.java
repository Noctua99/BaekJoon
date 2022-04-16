package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_1049 {

    public static int findMinMoney(int brokenStringsNum, int minPackagePrice, int minEachPrice) {
        int minMoney = Math.min(brokenStringsNum / 6 * minPackagePrice + brokenStringsNum % 6 * minEachPrice,
                brokenStringsNum * minEachPrice);

        if (brokenStringsNum % 6 != 0) {
            minMoney = Math.min(minMoney, (brokenStringsNum / 6 + 1) * minPackagePrice);
        }

        return minMoney;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int brokenStringsNum = Integer.parseInt(st.nextToken());    // 끊어진 기타줄의 수
        int brandsNum = Integer.parseInt(st.nextToken());     // 기타줄 브랜드의 수

        int minPackagePrice = Integer.MAX_VALUE;
        int minEachPrice = Integer.MAX_VALUE;

        for (int i = 0; i < brandsNum; i++) {
            st = new StringTokenizer(br.readLine());
            minPackagePrice = Math.min(minPackagePrice, Integer.parseInt(st.nextToken()));
            minEachPrice = Math.min(minEachPrice, Integer.parseInt(st.nextToken()));
        }

        System.out.println(findMinMoney(brokenStringsNum, minPackagePrice, minEachPrice));
    }
}
