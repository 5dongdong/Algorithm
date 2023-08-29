import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            pq.add(priority);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i == location) {
                        pq.clear(); // 우선순위가 가장 높은 프로세스를 찾았고, 목표 위치와 같으면 종료
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
