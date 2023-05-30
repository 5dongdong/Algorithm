import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("[a-zA-Z]");
        System.out.print(Arrays.toString(num));
        for(int i = 0; i < num.length; i++) {
            if (num[i].isEmpty()) {
                answer += 0;
            } else {
                answer += Integer.parseInt(num[i]);
            }
        }
        return answer;
    }
}