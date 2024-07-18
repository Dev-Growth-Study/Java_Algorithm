package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_17413_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String string = bf.readLine();

        List<Character> stack = new ArrayList<>();

        String str = "";

        int i = 0;

        while(i != string.length()) {
            if (string.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    System.out.printf(String.valueOf(stack.remove(stack.size()-1)));
                }
                while (string.charAt(i) != '>') {
                    str = str + string.charAt(i);
                    i = i + 1;
                }
                str = str + string.charAt(i);           // '>' 추가
                System.out.printf(str);
                str = "";
                i = i + 1;
            }
            else {
                if (string.charAt(i) != ' ') {
                    stack.add(string.charAt(i));
                    i = i + 1;
                } else {
                    while (!stack.isEmpty()) {
                        System.out.printf(String.valueOf(stack.remove(stack.size()-1)));
                    }
                    System.out.printf(" ");
                    i = i + 1;
                }
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.remove(stack.size() - 1));
        }
    }
}
