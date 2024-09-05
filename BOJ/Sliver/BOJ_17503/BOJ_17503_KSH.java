package BOJ.Silver.BOJ_17503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_17503_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());       // 축제가 열리는 기간
        int M = Integer.parseInt(st.nextToken());       // 채워야 하는 선호도의 합
        int K = Integer.parseInt(st.nextToken());       // 맥주 종류 개수

        int[][] beers = new int[K][2];
        PriorityQueue<Integer> drinkBeer = new PriorityQueue<>();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(bf.readLine());
            beers[i][0] = Integer.parseInt(st.nextToken());     // 맥주의 선호도
            beers[i][1] = Integer.parseInt(st.nextToken());     // 맥주의 도수 레벨
        }

        // 간 레벨을 최소값으로 만들어야 하므, '도수 레벨'로 정렬해야 한다
        Arrays.sort(beers, ((o1, o2) -> {
            return Integer.compare(o1[1], o2[1]);
        }));

        int sumPreference = 0;
        int result = -1;
        for (int i = 0; i < K; i++) {
            drinkBeer.add(beers[i][0]);
            sumPreference = sumPreference + beers[i][0];

            if (drinkBeer.size() == N) {
                if (sumPreference >= M) {
                    result = beers[i][1];
                    break;
                } else {
                    Integer removed = drinkBeer.poll();
                    sumPreference = sumPreference - removed;
                }
            }
        }

        System.out.println(result);
    }
}
