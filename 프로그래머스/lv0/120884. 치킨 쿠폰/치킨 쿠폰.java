class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken; 
        while (coupons >= 10) {
            int serviceChicken = coupons / 10;  // 쿠폰으로 받을 수 있는 서비스 치킨 수
            answer += serviceChicken;  // 서비스 치킨 수 누적
            coupons = (coupons % 10) + serviceChicken;  // 남은 쿠폰 수 업데이트
        }

        return answer;
    }
}
