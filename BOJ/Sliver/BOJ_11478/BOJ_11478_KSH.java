package BOJ.Silver.BOJ_11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11478_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String string = bf.readLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length() - i; j++) {
                set.add(string.substring(i, i+j+1));
            }
        }
        System.out.println(set.size());
    }
}
