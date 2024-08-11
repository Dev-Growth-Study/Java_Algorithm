package BOJ.Bronze.BOJ_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2675_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = bf.readLine().split(" ");
            int R = Integer.parseInt(s[0]);
            String string = s[1];

            // 메서드 호출
            StringBuilder answer = solution(R, string);
            System.out.println(answer);
        }
    }

    private static StringBuilder solution(int R, String string) {
        char[] charArray = string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            for (int j = 0; j < R; j++) {
                sb.append(c);
            }
        }
        return sb;
    }
}
