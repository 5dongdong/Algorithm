class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        String strk = String.valueOf(k);
        for(int num = i; num <= j; num++){
            String strn = String.valueOf(num);
            if(strn.contains(strk)){
                String[] arr = strn.split("");
                for(String answer: arr){
                    if(answer.equals(strk))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}