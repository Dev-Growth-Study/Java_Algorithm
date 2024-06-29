package BOJ.Sliver.BOJ_1205;

import java.util.*;
import java.io.*;
public class BOJ_1205_KHJ {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    if(N==0){
      System.out.println(1);
      System.exit(0);
    }
    int target = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());

    List<Integer> scores = new ArrayList<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N ; i ++){
      scores.add(Integer.parseInt(st.nextToken()));
    }
    scores.add(target);
    Collections.sort(scores, Collections.reverseOrder());

    int rank = scores.indexOf(target) + 1;
    int realRank = scores.lastIndexOf(target) + 1;

    if(realRank <= P){
      System.out.println(rank);
    }else {
      System.out.println(-1);
    }
  }
}
