package BOJ.Silver.BOJ_3085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3085_KSH {

    private static int N;
    private static char[][] list;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bf.readLine());

        list = new char[N][N];

        int result = 0;

        for (int i = 0; i < N; i++) {
            String string = bf.readLine();
            list[i] = string.toCharArray();
        }

        result = Math.max(result, maxCnt());

        // 인접한 행 변경하기
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (list[i][j-1] != list[i][j]) {
                    char temp = list[i][j-1];
                    list[i][j-1] = list[i][j];
                    list[i][j] = temp;

                    result = Math.max(result, maxCnt());

                    temp = list[i][j-1];
                    list[i][j-1] = list[i][j];
                    list[i][j] = temp;
                }
            }
        }

        // 인접한 열 변경하기
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (list[i-1][j] != list[i][j]) {
                    char temp = list[i-1][j];
                    list[i-1][j] = list[i][j];
                    list[i][j] = temp;

                    result = Math.max(result, maxCnt());

                    temp = list[i-1][j];
                    list[i-1][j] = list[i][j];
                    list[i][j] = temp;
                }
            }
        }

        System.out.println(result);
    }

    // 최대 개수 세기
    public static int maxCnt() {
        int result = 0;

        // 가로 최대 개수 구하기
        for (int i = 0; i < N; i++) {
            int widthCnt = 1;
            for (int j = 1; j < N; j++) {
                if (list[i][j-1] == list[i][j]) widthCnt = widthCnt + 1;
                else widthCnt = 1;

                result = Math.max(widthCnt, result);
            }
        }

        // 세로 최대 개수 구하기
        for (int i = 0; i < N; i++) {
            int heightCnt = 1;
            for (int j = 1; j < N; j++) {
                if (list[j-1][i] == list[j][i]) heightCnt = heightCnt + 1;
                else heightCnt = 1;

                result = Math.max(heightCnt, result);
            }
        }
        return result;
    }
}
