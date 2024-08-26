package BOJ.Silver.BOJ_15903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_15903_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        long[] card = new long[n];

        String[] string = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            card[i] = Long.parseLong(string[i]);
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(card);
            long minValue = card[0] + card[1];
            card[0] = minValue;
            card[1] = minValue;
        }

        long answer = 0;
        for (long c : card) {
            answer = answer + c;
        }

        System.out.println(answer);
    }
}