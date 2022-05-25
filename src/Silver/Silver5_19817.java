package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_19817 {

    static class Company {
        final int numOfEmployees;
        int maxSalary;

        public Company(int numOfEmployees, int maxSalary) {
            this.numOfEmployees = numOfEmployees;
            this.maxSalary = maxSalary;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfCompanies = Integer.parseInt(br.readLine());

        Company[] companies = new Company[numOfCompanies];

        int totalMaxSalary = Integer.MIN_VALUE;

        for (int i = 0; i < numOfCompanies; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfEmployees = Integer.parseInt(st.nextToken());
            int maxSalary = Integer.parseInt(st.nextToken());

            for (int j = 0; j < numOfEmployees - 1; j++) {
                maxSalary = Math.max(Integer.parseInt(st.nextToken()), maxSalary);
            }

            companies[i] = new Company(numOfEmployees, maxSalary);
            totalMaxSalary = Math.max(maxSalary, totalMaxSalary);
        }

        long minTotalIncrease = 0;

        for (Company company : companies) {
            minTotalIncrease += (long) (totalMaxSalary - company.maxSalary) * company.numOfEmployees;
        }

        System.out.println(minTotalIncrease);
    }
}