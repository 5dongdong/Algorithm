class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++) {
            answer = (answer * arr[i]) / gcd(answer, arr[i]);
        }
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        while(b != 0) {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}