package SWExpertAcademy.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1204_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            int testCase = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] score = new int[101];
            for (int j = 0; j < 1000; j++) {
                int number = Integer.parseInt(st.nextToken());
                score[number]++;
            }

            int maxValue = 0;
            int maxIndex = 0;
            for (int j = 0; j <= 100; j++) {
                if (score[j] >= maxValue) {
                    maxIndex = j;
                    maxValue = score[j];
                }
            }

            System.out.printf("#%d %d\n", testCase, maxIndex);
        }
    }
}
