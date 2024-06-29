package BOJ.Sliver.BOJ_1051;

import java.util.*;
import java.io.*;

public class BOJ_1051_KHJ {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int row = Integer.parseInt(st.nextToken());
    int col = Integer.parseInt(st.nextToken());
    int[][] maps = new int[row][col];

    for(int i=0; i<row; i++) {
      String str = br.readLine();
      for(int j=0; j<col; j++) {
        maps[i][j] = str.charAt(j) - '0';
      }
    }

    // result : 정사각형 조건을 만족하는 길이 (기본 1)
    int result = 1;
    for (int searchLen = 1; searchLen < Collections.min(List.of(row, col)); searchLen++) {
      if(solution(maps,row,col, searchLen)){
        result = searchLen + 1;
      }
    }

    if(result==1){
      System.out.println(1);
    }else{
      System.out.println(result*result);
    }

  }

  private static boolean solution(int[][] maps, int row, int col, int len) {
    for (int i = 0; i < row - len; i++) {
      for (int j = 0; j < col - len; j++) {
        if(checkSame(maps,i,j,len)){
          return true;
        }
      }
    }
    return false;
  }

  private static boolean checkSame(int[][] maps, int i, int j,int len) {
    int target = maps[i][j];
    return target == maps[i+len][j+len] &&
        target == maps[i+len][j] &&
        target == maps[i][j+len];
  }
}
