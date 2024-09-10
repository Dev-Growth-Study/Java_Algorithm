package SWExpertAcademy.D3.SW_1225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SW_1225_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 10; t++) {
            int N = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            Deque<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < 8; i++) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
            }

            int idx = 1;

            while (true) {
                if (idx >= 6) {
                    idx = 1;
                }

                int number = queue.removeFirst();
                int newNumber = number - (idx % 6);

                if (newNumber <= 0) {
                    queue.addLast(0);
                    break;
                } else {
                    queue.addLast(newNumber);
                    idx++;
                }
            }

            System.out.print("#" + N);
            for (Integer q : queue) {
                System.out.print(" " + q);
            }
            System.out.println();
        }
    }
}
