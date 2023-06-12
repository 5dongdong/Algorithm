import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String sb;
        for(int i = 0; i <= (t.length()-p.length()); i++){
            sb = t.substring(i, i+p.length());
            long No = Long.parseLong(sb);
            long pp = Long.parseLong(p);
            if(No <= pp) {
                answer ++;
            }
        }
        return answer;
    }
}