import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();
        for(int i = 0; i < cards1.length; i++) {
            card1.offer(cards1[i]);
        }
        for(int j = 0; j < cards2.length; j++) {
            card2.offer(cards2[j]);
        }
        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(card1.peek())) {
                card1.poll();
            } else if(goal[i].equals(card2.peek())) {
                card2.poll();
            } else {
                answer = "No";
            }
        }
        
        return answer;
    }
}