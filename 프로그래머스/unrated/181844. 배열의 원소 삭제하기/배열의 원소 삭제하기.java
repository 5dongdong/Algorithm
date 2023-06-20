import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        ArrayList<Integer> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            Alist.add(arr[i]);
        }
        for(int i = 0; i < delete_list.length; i++) {
            Blist.add(delete_list[i]);
        } 
        // Alist에서 Blist의 요소들을 제거
        for (int i = 0; i < Blist.size(); i++) {
            int num = Blist.get(i);
            for (int j = 0; j < Alist.size(); j++) {
                if (Alist.get(j) == num) {
                    Alist.remove(j);
                    j--; // 인덱스를 하나 줄여서 다음 요소를 검사하도록 함
                }
            }
        }
        int[] answer = new int[Alist.size()];
        for(int i = 0; i < Alist.size(); i++){
            answer[i] = Alist.get(i);
        }
        return answer;
    }
}