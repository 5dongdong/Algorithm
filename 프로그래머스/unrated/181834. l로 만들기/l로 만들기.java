class Solution {
    public String solution(String myString) {
        int num = 0;
        char[] arr = new char[myString.length()];
        arr = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++){
            if(arr[i] < 'l'){
                arr[i] = 'l';
            }
        }
        String answer = String.valueOf(arr);
        return answer;
    }
}