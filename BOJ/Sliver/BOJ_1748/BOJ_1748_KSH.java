package BOJ.Silver.BOJ_1748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int result = 0;

        int cnt = 1;

        int criteria = 10;

        for (int i = 1; i <= N; i++) {
            if (i % criteria == 0) {
                cnt = cnt + 1;
                criteria = criteria * 10;
            }

            result = result + cnt;
        }

        System.out.println(result);
    }
}
