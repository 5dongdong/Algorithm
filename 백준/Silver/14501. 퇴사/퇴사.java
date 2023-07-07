
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] time = new int[n];
        int[] price = new int[n];

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            time[i] = Integer.parseInt(st.nextToken());
            price[i] = Integer.parseInt(st.nextToken());
        }

        //dp : N 일에 벌수 있는 최대 수익
        int[] dp = new int[n+1];

        //점화식,,
        //현재 날짜에서 소요 시간과 비용을 더해 dp에 저장한다.
        //이후에 중복될시 최대값을 넣는다.
        //dp[i + time[i]] = max(dp[i + time[i], dp[i]] + price[i])

        for(int i = 0; i < n; i++) {
            if(i + time[i] <= n) {
                dp[i + time[i]] =Math.max(dp[i + time[i]], dp[i] + price[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        System.out.println(dp[n]);
    }
}
