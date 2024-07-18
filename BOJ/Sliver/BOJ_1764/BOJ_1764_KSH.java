package BOJ.Silver.BOJ_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        HashSet<String> set = new HashSet<>();

        List<String> result = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            set.add(bf.readLine());
        }

        for (int i = 0; i < M; i++) {
            String string = bf.readLine();
            if (set.contains(string)) {
                result.add(string);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());

        for (String re : result) {
            System.out.println(re);
        }
    }
}
