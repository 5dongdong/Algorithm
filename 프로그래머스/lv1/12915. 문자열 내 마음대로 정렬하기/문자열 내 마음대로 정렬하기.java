import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        for(int i = 0; i < strings.length; i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        System.out.print(arr);
        
        return answer;
    }
}