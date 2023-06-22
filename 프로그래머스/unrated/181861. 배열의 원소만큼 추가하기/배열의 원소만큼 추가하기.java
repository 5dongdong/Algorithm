import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++) {
                aList.add(arr[i]);
            }
        }
        return aList;
        }
    }