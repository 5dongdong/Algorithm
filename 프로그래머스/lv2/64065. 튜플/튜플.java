import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] split = s.split("\\},\\{");
        split[0] = split[0].replace("{", "");
        split[split.length - 1] = split[split.length -1].replace("}", "");
        System.out.println(split[0]);
        System.out.println(split[split.length - 1]);
        //split = ["2" , "2,1" , "2,1,3" , "2,1,3,4"];
        
        // 길이가 짧은 array 순으로 정렬
        String[][] sort = new String[split.length][];

        for (int i = 0 ; i < split.length ; i++) {
            String[] ss = split[i].split(",");
            sort[ss.length-1] = ss;
            //System.out.println(Arrays.toString(sortedByLength[ss.length-1]));
        }    
        // [["2"],
        // ["2", "1"],
        // ["2", "1", "3"], 
        // ["2", "1", "3", "4"]]

        // 길이가 짧은 array를 먼저 보면서,
        // set에 요소를 담으면서, set에 없었던 요소이면 answerStrArr에 추가
        HashSet<String> set = new HashSet<>();
        String[] answerArr = new String[split.length];
        for (int i = 0 ; i < sort.length ; i++) {
            for (int j = 0 ; j < sort[i].length ; j++) {
                if (!set.contains(sort[i][j])) {
                    answerArr[i] = sort[i][j];
                    set.add(sort[i][j]);
                }
            }
        }
        // set: 2, 1, 3, 4
        // answerArr: ["2", "1", "3", "4"]

        // 숫자 배열로 변환
        //System.out.println(Arrays.toString(answerArr));
        answer = new int[answerArr.length];
        for (int i = 0; i < answerArr.length ; i++) {
            answer[i] = Integer.parseInt(answerArr[i]);
        }
        
        return answer;
    }
}