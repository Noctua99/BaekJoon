package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int countryNum = Integer.parseInt(st.nextToken());
        int targetId = Integer.parseInt(st.nextToken());

        Country[] countries = new Country[countryNum];

        for (int i = 0; i < countryNum; i++) {
            st = new StringTokenizer(br.readLine());
            countries[i] = new Country(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(countries);

        int result = 0;

        countries[0].rank = 1;
        if (countries[0].id == targetId) {
            result = countries[0].rank;
        } else {
            for (int i = 1; i < countryNum; i++) {
                if (isTie(countries[i], countries[i - 1])) {
                    countries[i].rank = countries[i - 1].rank;
                } else {
                    countries[i].rank = i + 1;
                }

                if (countries[i].id == targetId) {
                    result = countries[i].rank;
                    break;
                }
            }
        }

        System.out.println(result);
    }

    public static boolean isTie(Country country1, Country country2) {
        return country1.gold == country2.gold &&
                country1.silver == country2.silver &&
                country1.bronze == country2.bronze;
    }

    static class Country implements Comparable<Country> {
        int id;
        int gold;
        int silver;
        int bronze;
        int rank;

        public Country(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Country o) {
            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return o.bronze - this.bronze;
                }
                return o.silver - this.silver;
            }
            return o.gold - this.gold;
        }
    }
}