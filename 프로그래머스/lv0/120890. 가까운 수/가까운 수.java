import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int close = array[0];
        int mindiff = Math.abs(n - array[0]);
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < mindiff) {
                mindiff = diff;
                close = array[i];
            } else if (diff == mindiff) {
                close = Math.min(close, array[i]);
            }
        }
        return close;
    }
}