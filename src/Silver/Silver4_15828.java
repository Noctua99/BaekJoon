package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Silver4_15828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> buffer = new ArrayDeque<>();

        int sizeOfBuffer = Integer.parseInt(br.readLine());

        while (true) {
            int inf = Integer.parseInt(br.readLine());

            if (inf == -1) {    // 종료
                break;
            } else if (inf == 0) {  // 라우터가 패킷 하나를 처리
                buffer.poll();
            } else {    //  해당하는 번호의 패킷이 입력으로 들어옴
                if (buffer.size() < sizeOfBuffer) {
                    buffer.offer(inf);
                }
            }
        }

        if (buffer.isEmpty()) {
            sb.append("empty");
        } else {
            for (int inf : buffer) {
                sb.append(inf).append(' ');
            }
        }

        System.out.println(sb);
    }
}
