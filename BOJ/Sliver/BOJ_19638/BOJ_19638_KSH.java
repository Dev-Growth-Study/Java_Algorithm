package BOJ.Silver.BOJ_19638;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_19638_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());       // 거인 인구수
        int H = Integer.parseInt(st.nextToken());       // 센티의 키
        int T = Integer.parseInt(st.nextToken());       // 뿅망치 횟수 제한

        // 내림차순으로 우선순위 큐 만들기
        PriorityQueue<Integer> giant = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < N; i++) {
            giant.add(Integer.parseInt(bf.readLine()));
        }

        int cnt = 0;

        while (cnt < T) {
            Integer maxHeight = giant.peek();

            if (maxHeight < H || maxHeight == 1) break;

            if (maxHeight > 1) {
                giant.poll();
                giant.add(maxHeight / 2);
            }
            cnt = cnt + 1;
        }

        if (giant.peek() < H) {
            System.out.println("YES");
            System.out.println(cnt);
        } else {
            System.out.println("NO");
            System.out.println(giant.peek());
        }
    }
}
