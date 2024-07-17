package BOJ.Silver.BOH_2491;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2491_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int result = 1;
        int increase = 1;
        int decrease = 1;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N-1; i++) {

            if (list.get(i+1) >= list.get(i)) {
                increase = increase + 1;
            } else {
                increase = 1;
            }

            if (list.get(i) >= list.get(i+1)) {
                decrease = decrease + 1;
            } else {
                decrease = 1;
            }

            result = Math.max(result, Math.max(increase, decrease));
        }

        System.out.println(result);
    }
}
