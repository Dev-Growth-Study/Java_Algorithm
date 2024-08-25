package BOJ.Silver.BOJ_2304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2304_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        // 가장 큰 높이를 가진 인덱스 위치 찾기
        int maxHeight = 0;
        int maxIndex = 0;
        for (int i = 0; i < N; i++) {
            if (list[i][1] > maxHeight) {
                maxIndex = i;
                maxHeight = list[i][1];
            }
        }

        // 넓이 구하기
        int answer = 0;

        // 왼쪽 넓이 구하기
        int beforeX = list[0][0];
        int leftMaxHeight = list[0][1];
        for (int i = 1; i <= maxIndex; i++) {
            int nowX = list[i][0];
            if (list[i][1] >= leftMaxHeight) {
                answer = answer + (nowX - beforeX) * leftMaxHeight;
                leftMaxHeight = list[i][1];
                beforeX = nowX;
            }
        }

        // 오른쪽 넓이 구하기
        beforeX = list[N-1][0];
        int rightMaxHeight = list[N-1][1];
        for (int i = N-2; i >= maxIndex; i--) {
            int nowX = list[i][0];
            if (list[i][1] >= rightMaxHeight) {
                answer = answer + Math.abs(nowX - beforeX) * rightMaxHeight;
                rightMaxHeight = list[i][1];
                beforeX = nowX;
            }
        }

        // 가장 큰 높이를 가진 부분 더하기
        answer = answer + maxHeight;

        System.out.println(answer);
    }
}