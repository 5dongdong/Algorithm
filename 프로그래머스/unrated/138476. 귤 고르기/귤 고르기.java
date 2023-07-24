import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int tan :  tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) +1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 개수가 많은 순부터 사용
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if(k<=0) break;
            answer++;
            k -= entry.getValue();
        }
        return answer;
    }
}