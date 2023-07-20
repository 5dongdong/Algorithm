import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        //k칸을 앞으로 점프 == 배터리 k 소모
        //현재까지 온 거리 * 2에 해당하는 위치로 순간 이동
        //최소 한칸은 앞으로 점프해야함
        //일단 1만큼 뛰고 순간이동으로 하면 2번위치
        while(n > 1){
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
                ans++;
            }
        }
        return ans;
    }
}