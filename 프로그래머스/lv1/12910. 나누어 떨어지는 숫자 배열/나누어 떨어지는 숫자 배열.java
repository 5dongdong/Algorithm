import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int[] arr2 = new int[arr.length];
        int cnt = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
        }
            if(cnt >= 1){
                answer = new int[cnt];
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[cnt-1] = arr[i];
                cnt--;
            }
            if(cnt == 0){
                break;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}