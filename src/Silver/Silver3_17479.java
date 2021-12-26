package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver3_17479 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<String, Integer> regularMenus = new HashMap<>();    // 일반메뉴의 이름과 가격
    static HashMap<String, Integer> specialMenus = new HashMap<>();    // 특별메뉴의 이름과 가격
    static HashSet<String> serviceMenus = new HashSet<>(); // 서비스 메뉴의 이름

    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numOfRegularMenus = Integer.parseInt(st.nextToken());   // 일반메뉴의 수
        int numOfSpecialMenus = Integer.parseInt(st.nextToken());   // 스페셜메뉴의 수
        int numOfServiceMenus = Integer.parseInt(st.nextToken());   // 서비스메뉴의 수

        while (numOfRegularMenus-- > 0) {
            st = new StringTokenizer(br.readLine());
            regularMenus.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        while (numOfSpecialMenus-- > 0) {
            st = new StringTokenizer(br.readLine());
            specialMenus.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        while (numOfServiceMenus-- > 0) {
            serviceMenus.add(br.readLine());
        }

        int numOfOrder = Integer.parseInt(br.readLine());   // 손님이 주문하는 음식의 수

        if (isCorrectOrder(numOfOrder)) {
            System.out.println("Okay");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isCorrectOrder(int numOfOrder) throws IOException {
        long regularMenuPriceSum = 0;   // 주문한 일반메뉴 가격의 합
        long totalMenuPriceSum = 0; // 주문한 메뉴들의 총합
        boolean isServiceMenuOrderExist = false;    // 이미 주문된 서비스 메뉴가 있는지
        while (numOfOrder-- > 0) {
            String order = br.readLine();
            if (regularMenus.containsKey(order)) {  // 일반메뉴
                int price = regularMenus.get(order);
                regularMenuPriceSum += price;
                totalMenuPriceSum += price;
            } else if (specialMenus.containsKey(order)) {   // 특별메뉴
                totalMenuPriceSum += specialMenus.get(order);
            } else {    // 서비스메뉴
                if (isServiceMenuOrderExist) {
                    return false;
                }
                isServiceMenuOrderExist = true;
            }
        }
        return (totalMenuPriceSum <= regularMenuPriceSum || regularMenuPriceSum >= 20000) && (!isServiceMenuOrderExist || totalMenuPriceSum >= 50000);
    }
}
