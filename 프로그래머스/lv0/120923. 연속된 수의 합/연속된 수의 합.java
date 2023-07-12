class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int x = 0;
        int y = 0;
        for(int i = 1; i < num; i++) {
            y += i;
        }
        x = (total - y) / num;
        for(int i = 0; i < num; i++){
            answer[i] = x + i;
        }
        return answer;
    }
}