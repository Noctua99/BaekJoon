package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver5_24465 {

    static final String CAPRICORN = "Capricorn";
    static final String AQUARIUS = "Aquarius";
    static final String PISCES = "Pisces";
    static final String ARIES = "Aries";
    static final String TAURUS = "Taurus";
    static final String GEMINI = "Gemini";
    static final String CANCER = "Cancer";
    static final String LEO = "Leo";
    static final String VIRGO = "Virgo";
    static final String LIBRA = "Libra";
    static final String SCORPIO = "Scorpio";
    static final String SAGITTARIUS = "Sagittarius";

    public static String birthdayToStarSign(int month, int day) {
        String starSign = "";

        switch (month) {
            case 1:
                starSign = day < 20 ? CAPRICORN : AQUARIUS;
                break;
            case 2:
                starSign = day < 19 ? AQUARIUS : PISCES;
                break;
            case 3:
                starSign = day < 21 ? PISCES : ARIES;
                break;
            case 4:
                starSign = day < 20 ? ARIES : TAURUS;
                break;
            case 5:
                starSign = day < 21 ? TAURUS : GEMINI;
                break;
            case 6:
                starSign = day < 22 ? GEMINI : CANCER;
                break;
            case 7:
                starSign = day < 23 ? CANCER : LEO;
                break;
            case 8:
                starSign = day < 23 ? LEO : VIRGO;
                break;
            case 9:
                starSign = day < 23 ? VIRGO : LIBRA;
                break;
            case 10:
                starSign = day < 23 ? LIBRA : SCORPIO;
                break;
            case 11:
                starSign = day < 23 ? SCORPIO : SAGITTARIUS;
                break;
            case 12:
                starSign = day < 22 ? SAGITTARIUS : CAPRICORN;
        }

        return starSign;
    }

    static class Applicant {
        final int month;
        final int day;

        public Applicant(int month, int day) {
            this.month = month;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        HashSet<String> existedStarSign = new HashSet<>();
        ArrayList<Applicant> successfulApplicants = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            existedStarSign.add(birthdayToStarSign(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        int numOfApplicants = Integer.parseInt(br.readLine());

        while (numOfApplicants-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            if (!existedStarSign.contains(birthdayToStarSign(month, day))) {
                successfulApplicants.add(new Applicant(
                        month, day
                ));
            }
        }

        if (successfulApplicants.isEmpty()) {
            result.append("ALL FAILED");
        } else {
            successfulApplicants.sort((o1, o2) ->
                    o1.month == o2.month ? (o1.day - o2.day) : (o1.month - o2.month));

            for (Applicant applicant : successfulApplicants) {
                result.append(applicant.month).append(' ').append(applicant.day).append('\n');
            }
        }

        System.out.println(result);
    }
}
