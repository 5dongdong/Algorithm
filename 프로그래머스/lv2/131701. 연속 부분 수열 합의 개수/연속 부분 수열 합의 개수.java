import java.util.*;

class Solution {
    public static int solution(int[] elements) {
        Set<Integer> ans = new HashSet<>(); //중복방지를 위해

        for (int i = 1; i <= elements.length; i++) { //길이가 1, 2, ,3 ,4, 5 ...for문돌려서 해결
            //여기서부터 길이가 1일때의 합, 2일때의 합
            for (int j = 0; j < elements.length; j++) {
                int sum = 0; // 초기값 0주고
                for (int k = 0; k < i; k++) {
                    if (j + k > elements.length - 1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
                }
                ans.add(sum);
            }
        }

        return ans.size();
    }
}