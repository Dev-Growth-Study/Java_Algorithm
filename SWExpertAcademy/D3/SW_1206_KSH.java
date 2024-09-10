package SWExpertAcademy.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1206_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] heights = new int[N];

            // heights 배열 만들기
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                heights[j] = num;
            }

            int result = 0;
            for (int j = 2; j < N-2; j++) {
                int maxValue = Math.max(heights[j-2], Math.max(heights[j-1], Math.max(heights[j+1], heights[j+2])));
                if (heights[j] - maxValue > 0) {
                    result = result + (heights[j] - maxValue);
                }
            }

            System.out.printf("#%d %d\n", i+1, result);
        }
    }
}
