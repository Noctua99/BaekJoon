package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1_16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numOfTickets = Integer.parseInt(br.readLine());
        boolean[] isSoldTicket = new boolean[numOfTickets + 2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfTickets; i++) {
            int soldTicketNumber = Integer.parseInt(st.nextToken());
            if (soldTicketNumber <= numOfTickets) {
                isSoldTicket[soldTicketNumber] = true;
            }
        }

        for (int i = 1; i <= numOfTickets + 1; i++) {
            if (!isSoldTicket[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
