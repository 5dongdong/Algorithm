import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // h-index는 여러개
        // 1번이상 인용된 논문 10 >= 1(h)번 이상
        // 2번이상 인용된 논문 10 >= 2(h)번 이상
        // citations.length = 논문의 수 (각 인덱스는 인용된 수)
        // 처음 h-index를 0
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            int cnt = 0; //1,0,2
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= i + 1) {
                    cnt++;
                }
            }
            if(cnt >= i+1) {
                list.add(i+1);
            }
        }
        
        if(list.isEmpty()) {
            answer = 0;
        } else {
            answer = list.get(list.size() - 1);
        }
        
        System.out.print(list);
        return answer;
    }
}