package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Silver4_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> bookAndSoldCount = new TreeMap<>();

        int numOfSoldBooks = Integer.parseInt(br.readLine());
        while (numOfSoldBooks-- > 0) {
            String bookName = br.readLine();
            bookAndSoldCount.put(bookName, bookAndSoldCount.getOrDefault(bookName, 0) + 1);
        }

        String maxSoldBookName = "";
        int maxSoldCount = Integer.MIN_VALUE;
        for (String bookName : bookAndSoldCount.keySet()) {
            int soldCount = bookAndSoldCount.get(bookName);

            if (soldCount > maxSoldCount) {
                maxSoldBookName = bookName;
                maxSoldCount = soldCount;
            }
        }
        System.out.println(maxSoldBookName);
    }
}
