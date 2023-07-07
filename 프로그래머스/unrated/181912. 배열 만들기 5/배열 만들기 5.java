import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        int x = 0;
        for(int i = 0; i < intStrs.length; i++) {
            x = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(x > k) {
                arr.add(x);
            }
        }
        System.out.print(arr);
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}