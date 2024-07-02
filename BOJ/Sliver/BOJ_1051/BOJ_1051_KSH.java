package BOJ.Sliver.BOJ_1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1051_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = Math.min(N, M);

        List<List<Integer>> rectangular = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            List<Integer> temp = new ArrayList<>();
            st = new StringTokenizer(bf.readLine(), "");
            String string = st.nextToken();
            for (int j = 0; j < M; j++) {
                char digit = string.charAt(j);
                temp.add(Integer.parseInt(String.valueOf(digit)));
            }
            rectangular.add(temp);
        }

//        System.out.println(rectangular);

        int recSize = -1;           // 정사각형 사이즈

        for (int k = min-1; k >= 0; k--) {
            for (int i = 0; i < N - k; i++) {
                for (int j = 0; j < M - k; j++) {
                    if ((rectangular.get(i).get(j).equals(rectangular.get(i).get(j+k))) &&
                            (rectangular.get(i).get(j).equals(rectangular.get(i + k).get(j)))&&
                            (rectangular.get(i).get(j).equals(rectangular.get(i+k).get(j+k)))) {
                        if ((k+1) * (k+1) > recSize) {
                            recSize = (k+1) * (k+1);
                        }
                    }
                }
            }
        }

        System.out.println(recSize);
    }
}
