class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++) {
            int[] arr = new int[included.length];
            arr[i] = a + d*i;
            if(included[i] == true) {
                answer += arr[i];
            }
        }
        return answer;
    }
}