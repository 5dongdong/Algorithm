import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        //조건 정리 앞단어의 마지막 char로 시작하지x => 탈락
        //조건 정리 중복단어 말할시 => 탈락
        //중복이 있으면 안돼 => map? 
        //단어의 마지막 c값을 저장하는 배열 과 다음 단어의 처음 값을 비교 하고 틀리면 return;
        HashMap<String, Integer> map = new HashMap<>();
        map.put(words[0], 0);
        
        for(int i = 1; i < words.length; i++) {
            map.put(words[i], 0);
            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)
              | map.size() < i +1) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        return answer;
    }
}