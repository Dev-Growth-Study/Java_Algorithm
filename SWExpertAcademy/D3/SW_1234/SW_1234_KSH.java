package SWExpertAcademy.D3.SW_1234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SW_1234_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            Stack<Character> stack = new Stack<>();
            String[] s = bf.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            String string = s[1];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                char c = string.charAt(i);

                if (stack.isEmpty() || c != stack.peek()) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }

            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }

            System.out.println("#" + t + " " + sb.reverse().toString());

//            System.out.printf("#%d %s" + t+1, sb.reverse().toString());
        }
    }
}
