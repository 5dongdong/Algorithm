import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        // StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 1; i < my_string.length(); i++){
            arr.add(my_string.substring(0, i));
        }
        if(arr.contains(is_prefix)){
            answer = 1;
        }else{
            answer = 0;
        }
        System.out.print(arr);
        return answer;
    }
}