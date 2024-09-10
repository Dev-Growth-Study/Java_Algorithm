package SWExpertAcademy.D3.SW_5215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SW_5215_KSH {
    private static int[] scores;
    private static int[] calories;
    private static int N, result, L;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());       // 재료의 수
            L = Integer.parseInt(st.nextToken());       // 재료의 칼로리
            scores = new int[N];
            calories = new int[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(bf.readLine());
                int score = Integer.parseInt(st.nextToken());
                int calorie = Integer.parseInt(st.nextToken());
                scores[i] = score;
                calories[i] = calorie;
            }

            int sumScore = 0;
            int sumCalorie = 0;

            // 메서드
            dfs(0, sumScore, sumCalorie);

            System.out.printf("#%d %d", t+1, result);
        }
    }

    private static void dfs(int index, int sumScore, int sumCalorie) {
        if (sumCalorie > L) return;

        if (index == N) {
            result = Math.max(sumScore, result);
            return;
        }

        dfs(index+1, sumScore + scores[index], sumCalorie + calories[index]);;
        dfs(index+1, sumScore, sumCalorie);
    }
}
