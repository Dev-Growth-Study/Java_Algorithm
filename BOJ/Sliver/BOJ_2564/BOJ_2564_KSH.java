package BOJ.Silver.BOJ_2564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2564_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int width = Integer.parseInt(st.nextToken());       // 가로길이
        int heigth = Integer.parseInt(st.nextToken());       // 세로길이

        int T = Integer.parseInt(bf.readLine());        // 테스트 개수

        List<Integer> list = new ArrayList<>();

        // 마지막 입력값은 동근이의 위치와 거리
        for (int i = 0; i < T+1; i++) {
            st = new StringTokenizer(bf.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            int temp;

            switch (dir) {
                // 북
                case 1:
                    temp = len;
                    list.add(temp);
                    break;
                // 남
                case 2:
                    temp = width + heigth + width - len;
                    list.add(temp);
                    break;
                // 서
                case 3:
                    temp = 2 * (width + heigth) - len;
                    list.add(temp);
                    break;
                // 동
                case 4:
                    temp = width + len;
                    list.add(temp);
                    break;
            }
        }

        int answer = 0;
        for (int i = 0; i < T; i++) {
            int l = Math.abs(list.get(T) - list.get(i));
            // 시계 방향과 반시계 방향 비교
            answer = answer + Math.min(l, 2 * (width + heigth) - l);
        }

        System.out.println(answer);
    }
}