import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        String [] spl = s.split(" ");
        int [] arr = new int[spl.length];
        for(int i =0; i<spl.length; i++){
            arr[i] = Integer.parseInt(spl[i]);
        }
        Arrays.sort(arr);
        String min = String.valueOf(arr[0]);
        String max = String.valueOf(arr[arr.length-1]);
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        answer = sb.toString();
        return answer;
    }
}