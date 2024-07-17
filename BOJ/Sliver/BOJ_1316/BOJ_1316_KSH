package BOJ.Silver.BOJ_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1316_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int i = 0;

        int result = N;

        while (i != N) {
            List<Character> list = new ArrayList<>();

            String string = bf.readLine();

            list.add(string.charAt(0));

            for (int j = 1; j < string.length(); j++) {
                if (string.charAt(j-1) != string.charAt(j)) {
                    if (list.contains(string.charAt(j))) {
                        result = result - 1;
                        break;
                    } else list.add(string.charAt(j));
                }
            }
            i = i + 1;
        }

        System.out.println(result);
    }
}
