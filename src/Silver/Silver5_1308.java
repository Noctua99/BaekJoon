package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_1308 {

    static int currentY;
    static int currentM;
    static int currentD;
    static int dDayY;
    static int dDayM;
    static int dDayD;

    public static long findRemainingDays() {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int remainingDays = 0;

        if (currentY == dDayY) {
            if (isLeapYear(currentY)) {
                if (currentM == dDayM) {
                    remainingDays += (dDayD - currentD);
                } else {
                    remainingDays += (leapDays[currentM] - currentD);
                    for (int i = currentM + 1; i < dDayM; i++) {
                        remainingDays += leapDays[i];
                    }
                    remainingDays += dDayD;
                }
            } else {
                if (currentM == dDayM) {
                    remainingDays += (dDayD - currentD);
                } else {
                    remainingDays += (days[currentM] - currentD);
                    for (int i = currentM + 1; i < dDayM; i++) {
                        remainingDays += days[i];
                    }
                    remainingDays += dDayD;
                }
            }
        } else {

        }

        return remainingDays;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isLastMoreThan1000Years() {
        if (dDayY - currentY == 1000) {
            if (dDayM == currentM) {
                return dDayD >= currentD;
            }

            return dDayM > currentM;
        }

        return dDayY - currentY > 1000;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        currentY = Integer.parseInt(st.nextToken());
        currentM = Integer.parseInt(st.nextToken());
        currentD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        dDayY = Integer.parseInt(st.nextToken());
        dDayM = Integer.parseInt(st.nextToken());
        dDayD = Integer.parseInt(st.nextToken());

        String result = isLastMoreThan1000Years() ? "gg" : ("D-" + findRemainingDays());

        System.out.println(result);
    }
}
