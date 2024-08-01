package BOJ.Silver.BOJ_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1138_KSH {

    private static int N;
    private static int[] position;
    private static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bf.readLine());

        position = new int[N+1];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 1; i <= N; i++) {
            position[i] = Integer.parseInt(st.nextToken());
        }

        // 메서드
        solution();

        for (Integer re : result) {
            System.out.printf(re + " ");
        }
    }

    private static void solution() {
        result = new ArrayList<>();

        for (int i = N; i >= 1; i--) {
            result.add(position[i], i);
        }
    }
}