import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);

        int removedCount = 0;
        for (int index : indices) {
            int adjustedIndex = index - removedCount;
            if (adjustedIndex >= 0 && adjustedIndex < sb.length()) {
                sb.deleteCharAt(adjustedIndex);
                removedCount++;
            }
        }

        return sb.toString();
    }
}
