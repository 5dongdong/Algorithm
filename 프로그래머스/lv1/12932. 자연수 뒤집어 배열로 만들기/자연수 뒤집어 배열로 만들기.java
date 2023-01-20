class Solution {
    public int[] solution(long n) {
        String s = "" + n;
        int[] answer = new int[s.length()];
        int result = 0;
        while(n > 0){
            answer[result]=(int)(n%10);
            n /= 10;
            result++;
        }
        return answer;
    }
}