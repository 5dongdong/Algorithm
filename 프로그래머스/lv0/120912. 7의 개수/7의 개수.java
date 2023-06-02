class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            String[] sArr = str.split("");
            
            for(int j = 0; j < sArr.length; j++) {
                if(sArr[j].equals("7")){
                answer++;
                }
            }
        }
        return answer;
    }
}