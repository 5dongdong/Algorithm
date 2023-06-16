import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<String, Integer>(); //hashMap선언
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
           // 각 사진별로 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                if (map.containsKey(person)) {
                    answer[i] += map.get(person);
                }
            }
        }
        return answer;
    }
}