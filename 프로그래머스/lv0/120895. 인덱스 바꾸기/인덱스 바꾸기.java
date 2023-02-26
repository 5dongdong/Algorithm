class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = new char[my_string.length()];
        char[] tmp = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        tmp[num1] = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp[num1];
        String arrayString = String.valueOf(arr);
        return arrayString;
    }
}