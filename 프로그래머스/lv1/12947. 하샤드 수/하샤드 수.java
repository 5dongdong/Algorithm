class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        
        while(tmp >= 10)
        {
            sum += tmp % 10;
            tmp /= 10;
        }
        
        sum += tmp;
        
        return x % sum == 0;               
    }
}
