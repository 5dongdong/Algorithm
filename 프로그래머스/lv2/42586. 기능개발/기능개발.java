import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int progress = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                progress += 1;
            }
            queue.add(progress);
        }
        
        int prev = queue.poll();  // 첫 번째 작업의 진행도
        int count = 1;            // 배포 횟수 카운트
        
        while (!queue.isEmpty()) {
            int current = queue.poll();  // 다음 작업의 진행도
            
            if (prev >= current) {
                count++;  // 이전 작업보다 진행도가 작거나 같으면 같이 배포될 수 있음
            } else {
                resultList.add(count);  // 이전 작업보다 진행도가 더 크면 배포하고 카운트 초기화
                count = 1;
                prev = current;
            }
        }
        resultList.add(count);  // 마지막 작업 배포 횟수 추가
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}