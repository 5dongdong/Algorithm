class Solution {
    public int[] solution(int[] arr) {
        
        //배열의 길이가 1인 경우
        if(arr.length == 1){
            int[] answer  = {-1};
            return answer; 
        }
        
        //배열의 길이가 1보다 큰 경우
        //가장 작을 수를 뺸 길이로 초기화
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; //하나의 값 기준
        //제일 작은 수 구하기
        for(int i = 1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        //반복문 index용
        int index = 0;
        //가장 작은 수를 제외한 배열 만들기
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }

    return answer;
}
}
