class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //number = 기사 수
        //limit = 공격력의 제한 수치
        //power = 무기의 공격력 
        
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
	            if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }
            if(cnt > limit) {
                cnt = power;
                answer += cnt;
            } else {
                answer += cnt;
            }
        }
        return answer;
    }
}