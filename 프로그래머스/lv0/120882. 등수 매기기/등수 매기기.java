class Solution {
    public int[] solution(int[][] score) {
        float[] avg = new float[score.length];
        for(int i = 0; i < score.length; i++) {
            avg[i] = (float)((score[i][0] + score[i][1])/2.0);
        }
        
        int[] answer = new int[score.length];
        for(int i = 0; i < avg.length; i++) {
            int grade = 1;
            for(int j = 0; j < avg.length; j++) {
                if(avg[i] < avg[j]) {
                    grade++;
                }
                answer[i] = grade;
            }
        }
        return answer;
    }
}