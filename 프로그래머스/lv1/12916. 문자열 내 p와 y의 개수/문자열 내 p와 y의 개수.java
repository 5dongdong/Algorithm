class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt= 0, ycnt = 0;
        String[] array = s.toLowerCase().split("");
        
        for(int i=0; i<array.length; i++){
            if("p".equals(array[i])){
                pcnt++;
            }else if("y".equals(array[i])){
                ycnt++;
            }
        }
        
        if(pcnt != ycnt){
            answer =  !answer;
        }else{
            answer = answer;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}