import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());

    int n = Integer.parseInt(st.nextToken()); // 첫번째 배열
    int m = Integer.parseInt(st.nextToken()); // 두번째 배열

    int [] arr = new int[n+m]; // 합칠 배열 초기

    st = new StringTokenizer(bf.readLine());

    for(int i = 0 ; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(bf.readLine());

    for(int i = 0; i < m; i++) {
      arr[i+n] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    StringBuilder sb = new StringBuilder();
    for(int r : arr) {
      sb.append(r + " ");
    }
    System.out.println(sb);
  }
}