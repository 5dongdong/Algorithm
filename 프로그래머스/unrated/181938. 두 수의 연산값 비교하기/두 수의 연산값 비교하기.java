class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = Integer.toString(a) + Integer.toString(b);
        if(Integer.parseInt(x) == (2 * a * b)){
            answer = Integer.parseInt(x);
        }
        if(Integer.parseInt(x) > (2*a*b)){
            answer = Integer.parseInt(x);
        } else {
            answer = (2 * a * b);
        }
        return answer;
    }
}