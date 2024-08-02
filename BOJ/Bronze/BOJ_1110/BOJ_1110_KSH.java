package BOJ.Bronze.BOJ_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110_KSH {
    private static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String string = bf.readLine();

        int result;

        if (Integer.parseInt(string) == 0) {
            System.out.println(cnt);
        } else if (string.length() < 2) {
            // 메서드
            int target = Integer.parseInt(string);
            result = lengthIsOne(target);
            System.out.println(result);
        } else {
            // 메서드
            int target = Integer.parseInt(string);
            result = lengthIsTwo(target);
            System.out.println(result);
        }
    }

    private static int lengthIsOne(int target) {
        int front = 0;
        int back = target;

        cnt = count(cnt, target, front, back);
        return cnt - 1;
    }

    private static int lengthIsTwo(int target) {
        int front = target / 10;
        int back = target % 10;

        cnt = count(cnt, target, front, back);
        return cnt - 1;
    }

    private static int count(int cnt, int target, int front, int back) {
        while (true) {
            cnt = cnt + 1;
            int number = front + back;
            int newNumber = (back * 10) + (number % 10);

            // 새로 만든 number 와 target 비교
            if (newNumber == target) {
                return cnt;
            }

            // 새로운 number 로 업데이트
            int newBack = newNumber % 10;
            front = back;
            back = newBack;
        }
    }
}
