package SWExpertAcademy.D3.SW_1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(bf.readLine());        // 덤프 횟수
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] heights = new int[100];
            int result;

            for (int j = 0; j < 100; j++) {
                heights[j] = Integer.parseInt(st.nextToken());
            }

            // 덤프 횟수만큼 비교
            for (int j = 0; j < N; j++) {
                int maxValue = Integer.MIN_VALUE;
                int maxIndex = 0;
                int minValue = Integer.MAX_VALUE;
                int minIndex = 0;
                for (int k = 0; k < 100; k++) {
                    if (heights[k] > maxValue) {
                        maxValue = heights[k];
                        maxIndex = k;
                    }
                    if (heights[k] < minValue) {
                        minValue = heights[k];
                        minIndex = k;
                    }
                }

//                System.out.println("minValue : " + minValue + " maxValue : " + maxValue);
//                System.out.println("minIndex : " + minIndex + " maxIndex : " + maxIndex);

                if (maxValue - minValue <= 1) {
                    break;
                }

                heights[maxIndex]--;
                heights[minIndex]++;
            }

            Arrays.sort(heights);
            result = heights[99] - heights[0];
            System.out.printf("#%d %d\n", i+1, result);
        }
    }
}
