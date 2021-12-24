package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Silver3_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numOfAvailStud = Integer.parseInt(st.nextToken());  // 과목의 수강 가능 인원
        int lenOfList = Integer.parseInt(st.nextToken());   // 학생들이 버튼을 클릭한 순서를 기록한 대기목록의 길이

        LinkedHashSet<String> orderSet = new LinkedHashSet<>();

        while (lenOfList-- > 0) {
            String studentID = br.readLine();
            orderSet.remove(studentID);
            orderSet.add(studentID);
        }
        for (String studentID : orderSet) {
            if (numOfAvailStud <= 0) break;
            sb.append(studentID).append('\n');
            numOfAvailStud--;
        }
        System.out.println(sb);
    }
}
