class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0];
        int b = 0;
        
        if (common[1] != 0) {
            b = common[2] / common[1];
        }

        if (common[2] - common[1] == a) {
            answer = common[common.length - 1] + a;
        } else {
            answer = common[common.length - 1] * b;
        }
        
        return answer;
    }
}
