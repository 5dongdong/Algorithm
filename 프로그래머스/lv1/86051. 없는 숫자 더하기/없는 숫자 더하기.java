class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int total = 0;
        int sum = 45;
        for(int i=0; i<numbers.length;i++){
            total += numbers[i];
        }
        answer = sum - total;
        return answer;
    }
}