package BOJ.Silver.BOJ_2477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2477_KSH {
    private static int[] list = new int[6];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());

        int maxX = 0;
        int maxY = 0;
        int maxIndexX = -1;
        int maxIndexY = -1;


        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            list[i] = value;

            if ((direction == 1) || (direction == 2)) {
                //
                if (value > maxX) {
                    maxX = value;
                    maxIndexX = i;
                }
            } else {
                if (value > maxY) {
                    maxY = value;
                    maxIndexY = i;
                }
            }
        }

        // 전체 사각형 넓이
        int totalSquare = maxX * maxY;

        // 작은 사각형 넓이 -> 어디서 시작하든 반시계방향으로 진행한다
        // 가장 큰 값의 가로, 세로의 인덱스에 +3을 하면 구하고자 하는 값의 인덱스가 나온다 -> 시작 위치에 따라 6을 넘어갈 수 있으므로 %6을 해주자!
        int minX = list[(maxIndexY + 3) % 6];
        int minY = list[(maxIndexX + 3) % 6];
        int partSquare = minX * minY;

        // 구하고자 하는 사각형 넓이 구하기
        int square = totalSquare - partSquare;

        // 참외 개수 구하기
        int result = square * K;

        System.out.println(result);
    }
}