package BOJ.Silver.BOJ_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10845_KSH {

    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int number = Integer.parseInt(st.nextToken());
                    push(number);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
            }
        }
    }

    private static void push(int number) {
        list.add(number);
    }

    private static int pop() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.remove(0);
        }
    }

    private static int size() {
        return list.size();
    }

    private static int empty() {
        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int front() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.get(0);
        }
    }

    private static int back() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.get(list.size()-1);
        }
    }
}
