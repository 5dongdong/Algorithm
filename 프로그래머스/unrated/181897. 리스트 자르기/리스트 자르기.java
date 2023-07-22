import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;

        if (n == 1) {
            int b = slicer[1];
            answer = Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            int a = slicer[0];
            answer = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            int a = slicer[0];
            int b = slicer[1];
            answer = Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
            List<Integer> resultList = new ArrayList<>();
            for (int i = a; i <= b; i += c) {
                resultList.add(num_list[i]);
            }
            answer = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }
        } else {
            answer = new int[0];
        }
        return answer;
    }
}
