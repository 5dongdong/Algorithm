class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(i*i == n)
                cnt +=2;
            else if(n % i == 0)
                cnt +=2;
        }
        return cnt/2;
    }
}