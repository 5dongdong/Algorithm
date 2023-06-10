class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String x = Integer.toString(a) + Integer.toString(b);
        String y = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(x) > Integer.parseInt(y)){
            answer = Integer.parseInt(x);
        } else {
            answer = Integer.parseInt(y);
        }
        return answer;
    }
}