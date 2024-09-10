package SWExpertAcademy.D2.SW_1859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1859_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] list = new int[N];

            for (int j = 0; j < N; j++) {
                list[j] = Integer.parseInt(st.nextToken());
            }
            // 메서드
            long result = maxInterest(list);
            System.out.printf("#%d %d\n", i+1, result);
        }
    }

    private static long maxInterest(int[] list) {
        int maxValue = list[list.length-1];
        long interest = 0;

        for (int i = list.length-2; i >= 0; i--) {
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
            interest = interest + (maxValue - list[i]);
        }

        return interest;
    }
}
