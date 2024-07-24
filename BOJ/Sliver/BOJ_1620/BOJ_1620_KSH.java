package BOJ.Silver.BOJ_1620;

import java.io.*;
import java.util.HashMap;

public class BOJ_1620_KSH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = bf.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        HashMap<String, Integer> numberPocketmon = new HashMap<>();
        HashMap<Integer, String> namePocketmon = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String string = bf.readLine();

            numberPocketmon.put(string, i+1);
            namePocketmon.put(i+1, string);
        }

        for (int i = 0; i < M; i++) {
            String name = bf.readLine();

            if (Character.isDigit(name.charAt(0))) {
                String nameResult = namePocketmon.get(Integer.parseInt(name));
                bw.write(nameResult);
                bw.newLine();
            } else {
                Integer numberResult = numberPocketmon.get(name);
                bw.write(numberResult);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
