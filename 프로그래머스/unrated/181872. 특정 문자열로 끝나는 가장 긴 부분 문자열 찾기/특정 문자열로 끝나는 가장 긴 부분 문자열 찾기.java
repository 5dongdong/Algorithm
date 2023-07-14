class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int cnt = 1;
        for(int i = 0; i < myString.length(); i++) {
            if(pat.charAt(pat.length() - 1) == myString.charAt(i)) {
                cnt = i;
            }
        }
        answer = myString.substring(0, cnt+1);
        return answer;
    }
}