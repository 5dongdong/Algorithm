class Solution {
    static int cnt = 0;
    static int all = 0;
    public int[] solution(String s) {
        int[] answer = new int[2];
        delete(s);
        answer[0] = all; //이진 변환 횟수
        answer[1] = cnt; //변환중 제거된 모든 0의 개수
        return answer;
    }
    private String delete(String s) {
        if(s.equals("1")){
            return "";
        }
        int zero = 0;
        for(int i  = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zero ++;
            }
        }
        cnt += zero;
        int length = s.length() - zero;
        all++;
        return delete(Integer.toString(length,2));
}
}