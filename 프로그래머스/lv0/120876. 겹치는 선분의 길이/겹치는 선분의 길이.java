class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        
        for (int[] i : lines) {
            int a = i[0] + 100;
            int b = i[1] + 100;
            
            for(int k = a; k < b; k++) {
                arr[k] += 1;
            }
        }
        for(int i : arr) {
            if(i > 1){
                answer++;
            }
        }
        return answer;
    }
}