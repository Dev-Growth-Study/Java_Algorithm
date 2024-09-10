package SWExpertAcademy.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 10; t++) {
            int[][] list = new int[100][100];
            int testCase = Integer.parseInt(bf.readLine());

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < 100; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    list[i][j] = num;
                }
            }

            int[] rowSum = new int[100];
            int[] colSum = new int[100];

            // 가로 합 계산하기
            for (int i = 0; i < 100; i++) {
                int sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum = sum + list[i][j];
                }
                rowSum[i] = sum;
            }

            // 세로 합 계산하기
            for (int i = 0; i < 100; i++) {
                int sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum = sum + list[j][i];
                }
                colSum[i] = sum;
            }

            // 대각선 계산하기
            int arrowSum = 0;
            for (int i = 0; i < 100; i++) {
                arrowSum = arrowSum + list[i][i];
            }

            int result = 0;
            for (int i = 0; i < 100; i++) {
                result = Math.max(result, Math.max(arrowSum, Math.max(rowSum[i], colSum[i])));
            }

            System.out.printf("#%d %d\n", testCase, result);
        }
    }
}
