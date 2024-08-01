package BOJ.Silver.BOJ_8911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8911_KSH {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String command = bf.readLine();
            // 메서드
            int result = solution(command);
            System.out.println(result);
        }
    }

    private static int solution(String command) {
        int index = 0;
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        int nowX = 0;
        int nowY = 0;

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);

            switch (c) {
                case 'F':
                    nowX = nowX + dx[index];
                    nowY = nowY + dy[index];
                    break;
                case 'B':
                    nowX = nowX - dx[index];
                    nowY = nowY - dy[index];
                    break;
                case 'L':
                    // 북 -> 서 -> 남 -> 동 로 이동해야 한다
                    if (index == 0) {
                        index = 3;
                    } else {
                        index = index - 1;
                    }
                    break;
                case 'R':
                    // 북 -> 동 -> 남 -> 서 로 이동해야 한다
                    if (index == 3) {
                        index = 0;
                    } else {
                        index = index + 1;
                    }
                    break;
            }

            // minX maxX minY maxY 비교해서 최소값, 최대값 구하기
            minX = Math.min(minX, nowX);
            maxX = Math.max(maxX, nowX);
            minY = Math.min(minY, nowY);
            maxY = Math.max(maxY, nowY);
        }
        int result = Math.abs(maxX - minX) * Math.abs(maxY - minY);

        return result;
    }
}