class Solution {
    public int combination(int n, int r) {
        if (r == 0 || n == r){
            return 1;
        }else{
            return solution(n-1, r-1) + solution(n-1, r);
        }
    }
    public int solution(int balls, int share){
        return combination(balls, share);
    }
}