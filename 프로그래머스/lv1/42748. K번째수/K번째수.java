import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int k = command[2] - 1;
            
            int[] slicedArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(slicedArray);
            
            answer[i] = slicedArray[k];
        }
        
        return answer;
    }
}