package BOJ.Silver.BOJ_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_9012_KSH {
    private static List<Character> list;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            list = new ArrayList<>();
            System.out.println(solution(str));
        }
    }

    private static String solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') list.add('(');
            else if (list.isEmpty()) return "NO";
            else list.remove(list.size() - 1);
        }

        if (list.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
