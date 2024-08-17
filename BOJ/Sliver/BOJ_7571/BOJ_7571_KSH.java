package BOJ.Silver.BOJ_7571;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_7571_KSH {
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int y = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;

            xList.add(x);
            yList.add(y);
        }

        Collections.sort(xList);
        Collections.sort(yList);

        // 중앙값 계산
        int medianX = xList.get(xList.size() / 2);
        int medianY = yList.get(yList.size() / 2);

        // 모든 점으로부터 중앙값 위치까지의 거리 합을 계산
        int totalDistance = 0;
        for (int i = 0; i < M; i++) {
            totalDistance += Math.abs(xList.get(i) - medianX) + Math.abs(yList.get(i) - medianY);
        }

        System.out.println(totalDistance);
    }
}
