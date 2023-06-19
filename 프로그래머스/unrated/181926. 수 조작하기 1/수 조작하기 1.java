class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int cnt = 0;
        String[] arr = new String[control.length()];
        arr = control.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")){
                n += 1;
            } else if(arr[i].equals("s")){
                n -= 1;
            } else if(arr[i].equals("d")){
                n += 10;
            } else{
                n -= 10;
            }
        }
        return n;
    }
}