class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str ="";
        String str2="";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                str += Integer.toString(num_list[i]);
            } else{
                str2 += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(str) + Integer.parseInt(str2);
        return answer;
    }
}