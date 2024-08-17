package BOJ.Silver.BOJ_1347;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1347_KSH {
    // 남 -> 서 -> 북 -> 동
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String string = bf.readLine();

        char[] charArray = string.toCharArray();

        int[][] visited = new int[100][100];

        int index = 0;

        int x = 50;
        int y = 50;
        int maxX = 50;
        int minX = 50;
        int maxY = 50;
        int minY = 50;
        visited[y][x] = 1;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            switch (c) {
                case 'L':
                    index = (index + 3) % 4;
                    break;
                case 'R':
                    index = (index + 1) % 4;
                    break;
                case 'F':
                    x = x + dx[index];
                    y = y + dy[index];
                    visited[y][x] = 1;

                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
            }
        }

//        System.out.println("minX : " + minX);
//        System.out.println("maxX : " + maxX);
//        System.out.println("minY = " + minY);
//        System.out.println("maxY = " + maxY);

        for (int i = minY; i <= maxY; i++) {
            for (int j = minX; j <= maxX; j++) {
                if (visited[i][j] == 1) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
