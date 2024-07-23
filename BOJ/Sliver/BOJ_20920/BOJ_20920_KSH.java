package BOJ.Silver.BOJ_20920;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_20920_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> wordMap = new HashMap<>();

        String[] s = bf.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        for (int i = 0; i < N; i++) {
            String string = bf.readLine();

            wordMap.put(string, wordMap.getOrDefault(string, 0) + 1);
        }

        bf.close();

        // key 값을 HashMap 으로 만들기
        List<String> word = wordMap.keySet().stream().collect(Collectors.toList());

        word.sort((w1, w2) -> {
            int w1Count = wordMap.get(w1);
            int w2Count = wordMap.get(w2);

            if (w1Count != w2Count) {
                return w2Count - w1Count;
            } else {
                if (w1.length() != w2.length()) {
                    return w2.length() - w1.length();
                } else {
                    return w1.compareTo(w2);
                }
            }
        });

        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).length() >= M) bw.write(word.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
