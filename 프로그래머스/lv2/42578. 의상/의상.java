import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String item = clothes[i][0]; // 의상 이름
            String category = clothes[i][1]; // 의상 종류
            // 이미 해당 종류의 의상이 맵에 저장되어 있는 경우 개수를 증가시킴
            // 저장되어 있지 않은 경우 1로 초기화
            map.put(category, map.getOrDefault(category, 1) + 1);
        }
        for (int value : map.values()) {
            answer *= value;
        }
        // System.out.print(map);
        return answer - 1;
    }
}