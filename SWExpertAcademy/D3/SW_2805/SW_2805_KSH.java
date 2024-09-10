package SWExpertAcademy.D3.SW_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SW_2805_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            int[][] farm = new int[N][N];
            for (int j = 0; j < N; j++) {
                char[] charArray = bf.readLine().toCharArray();
                for (int k = 0; k < N; k++) {
                    farm[j][k] = charArray[k] - '0';
                }
            }

            int sum = 0;

            // 절반만
            for (int j = 0; j <= N/2; j++) {
                for (int k = 0; k < N; k++) {
                    if (k >= N/2 - j && k <= N/2 + j) {
                        sum = sum + farm[j][k];
                    }
                }
            }

            // 절반 이후
            for (int j = N/2+1; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (k >= N/2 - (N-j-1) && k <= N/2 + (N-j-1)) {
                        sum = sum + farm[j][k];
                    }
                }
            }

            System.out.printf("#%d %d\n", i+1, sum);
        }
    }
}
