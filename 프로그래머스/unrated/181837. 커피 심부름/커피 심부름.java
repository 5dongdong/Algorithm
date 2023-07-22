class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("latte")) {
                cnt += 5000;
            } else if(order[i].contains("ame")) {
                cnt += 4500;
            } else {
                cnt += 4500;
            }
        }
        return cnt;
    }
}