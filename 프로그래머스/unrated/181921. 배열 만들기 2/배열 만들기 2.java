import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(int l, int r) {
        String regex = "^[05]+$"; //정규식
        List<Integer> resultList = new ArrayList<>();//Array리슽으 선언

        for (int i = l; i <= r; i++) {
            String x = Integer.toString(i);
            if (Pattern.matches(regex, x)) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }
            return answer;
        }
    }
}
