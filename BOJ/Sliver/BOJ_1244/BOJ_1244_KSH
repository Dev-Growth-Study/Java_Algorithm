package BOJ.Silver.BOJ_1244_KSH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244_KSH {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int switchCnt = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] switchList = new int[switchCnt];

        for (int i = 0; i < switchCnt; i++) {
            switchList[i] = Integer.parseInt(st.nextToken());
        }

        int studentCnt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < studentCnt; i++) {
            st = new StringTokenizer(bf.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = 1; j <= switchCnt; j++) {
                    if (j % number == 0) {
                        if (switchList[j-1] == 0) switchList[j-1] = 1;
                        else switchList[j-1] = 0;
                    }
                }
            } else if (gender == 2) {
                for (int j = 1; j <= switchCnt; j++) {
                    if (j == number) {
                        if (switchList[j-1] == 0) switchList[j-1] = 1;
                        else switchList[j-1] = 0;

                        int left = number - 1;
                        int right = number + 1;

                        while (left > 0 && right <= switchCnt) {
                            if (switchList[left-1] == switchList[right-1]) {
                                if (switchList[left - 1] == 0) switchList[left-1] = switchList[right-1] = 1;
                                else switchList[left-1] = switchList[right-1] = 0;
                                left = left - 1;
                                right = right + 1;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }

        for (int i = 1; i <= switchCnt; i++) {
            if (i % 20 == 0) {
                System.out.print(switchList[i-1]);
                System.out.println();
            } else {
                System.out.printf("%d ", switchList[i-1]);
            }
        }

    }
}
