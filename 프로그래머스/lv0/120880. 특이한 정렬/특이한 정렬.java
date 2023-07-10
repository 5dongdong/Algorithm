import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            int num = Math.abs(numlist[i] - n);
            list.add(num);
        }
        
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            indexes.add(i);
        }
        
        Collections.sort(indexes, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int dist1 = list.get(o1);
                int dist2 = list.get(o2);
                
                if (dist1 == dist2) {
                    return Integer.compare(numlist[o2], numlist[o1]);
                }
                
                return Integer.compare(dist1, dist2);
            }
        });
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[indexes.get(i)];
        }
        
        return answer;
    }
}
