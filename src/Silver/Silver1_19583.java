package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Silver1_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " :");
        int hourS = Integer.parseInt(st.nextToken());   // 개강 총회를 시작한 시간(시)
        int minuteS = Integer.parseInt(st.nextToken()); // 개강 총회를 시작한 시간(분)
        int hourE = Integer.parseInt(st.nextToken());   // 개강 총회를 끝낸 시간(시)
        int minuteE = Integer.parseInt(st.nextToken()); // 개강 총회를 끝낸 시간(분)
        int hourQ = Integer.parseInt(st.nextToken());   // 개강 총회 스트리밍을 끝낸 시간(시)
        int minuteQ = Integer.parseInt(st.nextToken()); // 개강 총회 스트리밍을 끝낸 시간(분)

        HashSet<String> enteredMembers = new HashSet<>();   // 개강총회에 제 시간에 입장한 학회원
        int count = 0;  // 입장부터 퇴장까지 모두 확인된 학회원 수

        String input = "";
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input, " :");
            int hourChat = Integer.parseInt(st.nextToken());    // 채팅이 입력된 시간(시)
            int minuteChat = Integer.parseInt(st.nextToken());  // 채팅이 입력된 시간(분)
            String nickname = st.nextToken();        // 학회원 닉네임
            if (hourChat < hourS || (hourChat == hourS && minuteChat <= minuteS)) {
                enteredMembers.add(nickname);
            }
            if (hourChat > hourE || (hourChat == hourE && minuteChat >= minuteE)) {
                if (hourChat < hourQ || (hourChat == hourQ && minuteChat <= minuteQ)) {
                    if (enteredMembers.contains(nickname)) {
                        count++;
                        enteredMembers.remove(nickname);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
