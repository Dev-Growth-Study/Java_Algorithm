package BOJ.Sliver.BOJ_1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        List<Integer> nowRankingList = new ArrayList<>();

        int index = -1;

        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        if (N == 0) {
            System.out.println(1);
            System.exit(0);
        }

        for (int i = 0; i < N; i++) {
            nowRankingList.add(Integer.parseInt(st.nextToken()));
        }

//        nowRankingList.sort(); 역정렬하기
        Collections.sort(nowRankingList, Collections.reverseOrder());

        if (N == p && score <= nowRankingList.get(nowRankingList.size() - 1)) {
            System.out.println(-1);
            System.exit(0);
        }

        if (nowRankingList.get(0) == score) {
            System.out.println(1);
        }

        for (int i = 1; i < N; i++) {
            if (nowRankingList.get(i) == score) {
                index = i+1;
                System.out.println(index);
                break;
            } else if (nowRankingList.get(i-1) > score && nowRankingList.get(i) < score) {
                index = i+1;
                System.out.println(index);
                break;
            }
        }

//        for (int i = 1; i < N; i++) {
//            if (nowRankingList.get(i) == score) {
//                index = i + 1;
//                if (index >= p) {
//                    System.out.println(-1);
//                    break;
//                }
//                System.out.println(index);
//            } else if (nowRankingList.get(i-1) > score && score > nowRankingList.get(i)) {
//                index = i + 1;
//                if (index > p) {
//                    System.out.println(-1);
//                    break;
//                }
//                System.out.println(index);
//            }
//        }

    }
}
