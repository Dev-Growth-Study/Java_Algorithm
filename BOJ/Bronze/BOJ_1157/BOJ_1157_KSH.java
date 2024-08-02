package BOJ.Bronze.BOJ_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_1157_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        String string = bf.readLine();

        String newString = string.toUpperCase();

        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxKey = ' ';
        int maxValue = -1;
        boolean isDuplicated = false;

        for (Character key : map.keySet()) {
            Integer value = map.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
                isDuplicated = false;
            } else if (value == maxValue) {
                isDuplicated = true;
            }
        }

        if (isDuplicated) {
            System.out.println("?");
        } else {
            System.out.println(maxKey);
        }
    }
}
