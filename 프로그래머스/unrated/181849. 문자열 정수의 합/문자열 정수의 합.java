class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++) {
            String[] arr = num_str.split("");
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}