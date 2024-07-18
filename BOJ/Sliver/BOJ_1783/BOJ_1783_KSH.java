package BOJ.Silver.BOJ_1783_KSH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1783_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());   // 세로길이
        int M = Integer.parseInt(st.nextToken());   // 가로길이

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(Math.min(4, (M+1)/2));
        } else if (N >= 3) {
            if (M >= 7) {
                System.out.println(M-2);
            } else {
                System.out.println(Math.min(4, M));
            }
        }
    }
}
